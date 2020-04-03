package net.digistar.vanadio.support;

import com.abubusoft.kripton.BinderContext;
import com.abubusoft.kripton.BinderType;
import com.abubusoft.kripton.KriptonBinder;
import net.digistar.vanadio.model.JasperReport;


public final class VanadioTestUtils {

  public static JasperReport read(String fileName) throws Exception {
    BinderContext binder = KriptonBinder.bind(BinderType.XML);
    return binder.parse(VanadioTestUtils.class.getClassLoader().getResource("reports/" + fileName + ".jrxml").openStream(), JasperReport.class);
  }

  public static String write(JasperReport report) throws Exception {
    BinderContext binder = KriptonBinder.bind(BinderType.JSON);
    return binder.serialize(report);
  }
}