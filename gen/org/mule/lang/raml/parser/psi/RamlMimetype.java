// This is a generated file. Not intended for manual editing.
package org.mule.lang.raml.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RamlMimetype extends PsiElement {

  @NotNull
  RamlParameter getParameter();

  @NotNull
  List<RamlSubtype> getSubtypeList();

  @NotNull
  RamlType getType();

}
