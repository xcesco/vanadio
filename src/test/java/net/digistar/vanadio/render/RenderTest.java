package net.digistar.vanadio.render;

import android.graphics.pdf.PdfDocument;
import net.digistar.vanadio.model.JasperReport;
import net.digistar.vanadio.support.VanadioTestUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.logging.Logger;

import static android.graphics.pdf.PdfDocument.Page;
import static android.graphics.pdf.PdfDocument.PageInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class RenderTest {
  Logger logger = Logger.getLogger(getClass().getName());

  @Test
  public void testReadJasperReport() throws Exception {
    JasperReport report = VanadioTestUtils.read("ricetta");

    String result = VanadioTestUtils.writeAsYaml(report);
    logger.info(result);

    VanadioTestUtils.writeYAML(report, "ricetta");
  }

  @Test
  public void testPdfDocument() {

  }
}
