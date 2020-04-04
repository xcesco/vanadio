package net.digistar.vanadio.support;

import com.abubusoft.kripton.BinderContext;
import com.abubusoft.kripton.BinderType;
import com.abubusoft.kripton.KriptonBinder;
import net.digistar.vanadio.model.JasperReport;

import java.io.File;


public final class VanadioTestUtils {

  public static JasperReport read(String fileName) throws Exception {
    BinderContext binder = KriptonBinder.bind(BinderType.XML);
    return binder.parse(VanadioTestUtils.class.getClassLoader().getResource("reports/" + fileName + ".jrxml").openStream(), JasperReport.class);
  }

  public static void writeYAML(JasperReport report, String fileName) {
    BinderContext binder = KriptonBinder.bind(BinderType.YAML);
    String path="src/test/resources/reports/" + fileName + ".yaml";
   // System.out.println("File: "+new File(path));
    binder.serialize(report, new File(path));
  }

  public static String write(JasperReport report) {
    BinderContext binder = KriptonBinder.bind(BinderType.JSON);
    return binder.serialize(report);
  }

  public static String writeAsYaml(JasperReport report) {
    BinderContext binder = KriptonBinder.bind(BinderType.YAML);
    return binder.serialize(report);
  }
}