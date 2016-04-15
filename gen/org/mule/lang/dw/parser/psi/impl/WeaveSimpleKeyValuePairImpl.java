// This is a generated file. Not intended for manual editing.
package org.mule.lang.dw.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.mule.lang.dw.parser.psi.WeaveTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.mule.lang.dw.parser.psi.*;
import com.intellij.navigation.ItemPresentation;

public class WeaveSimpleKeyValuePairImpl extends ASTWrapperPsiElement implements WeaveSimpleKeyValuePair {

  public WeaveSimpleKeyValuePairImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WeaveVisitor visitor) {
    visitor.visitSimpleKeyValuePair(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WeaveVisitor) accept((WeaveVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public WeaveExpression getExpression() {
    return findNotNullChildByClass(WeaveExpression.class);
  }

  @Override
  @NotNull
  public WeaveKey getKey() {
    return findNotNullChildByClass(WeaveKey.class);
  }

  public ItemPresentation getPresentation() {
    return WeavePsiImplUtils.getPresentation(this);
  }

}
