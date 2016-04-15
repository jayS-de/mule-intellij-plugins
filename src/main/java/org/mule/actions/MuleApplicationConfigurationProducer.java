package org.mule.actions;

import com.intellij.execution.Location;
import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.junit.JavaRunConfigurationProducerBase;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiElement;
import org.apache.commons.lang.StringUtils;
import org.mule.launcher.configuration.MuleConfiguration;
import org.mule.launcher.configuration.MuleConfigurationType;
import org.mule.util.MuleConfigUtils;

public class MuleApplicationConfigurationProducer extends JavaRunConfigurationProducerBase<MuleConfiguration>
{
    protected MuleApplicationConfigurationProducer()
    {
        super(MuleConfigurationType.getInstance());
    }

    @Override
    protected boolean setupConfigurationFromContext(MuleConfiguration muleConfiguration, ConfigurationContext configurationContext, Ref<PsiElement> ref)
    {
        final Location location = configurationContext.getLocation();
        if (location != null)
        {
            final boolean muleFile = MuleConfigUtils.isMuleFile(location.getPsiElement().getContainingFile());
            if (muleFile)
            {
                muleConfiguration.setModule(configurationContext.getModule());
                muleConfiguration.setName(StringUtils.capitalize(configurationContext.getModule().getName()));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isConfigurationFromContext(MuleConfiguration muleConfiguration, ConfigurationContext configurationContext)
    {
        return configurationContext.getModule().equals(muleConfiguration.getModule());
    }
}
