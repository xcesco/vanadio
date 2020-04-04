package net.digistar.vanadio.model;

import net.digistar.vanadio.support.VanadioTestUtils;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class JasperReportTest {
  Logger logger = Logger.getLogger(getClass().getName());

  @Test
  public void testReadJasperReport() throws Exception {
    JasperReport report = VanadioTestUtils.read("ricetta");

    String result = VanadioTestUtils.writeAsYaml(report);
    logger.info(result);
  }
}
