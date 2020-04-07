package net.digistar.vanadio.support;

import com.abubusoft.kripton.TypeAdapter;
import com.abubusoft.kripton.common.CaseFormat;
import net.digistar.vanadio.model.ComplexEvaluationTime;

public class ComplexEvaluationTimeAdapter implements TypeAdapter<ComplexEvaluationTime, String> {
  @Override
  public ComplexEvaluationTime toJava(String dataValue) {
    return ComplexEvaluationTime.valueOf(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, dataValue));
  }

  @Override
  public String toData(ComplexEvaluationTime javaValue) {
    return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, javaValue.toString());
  }
}
