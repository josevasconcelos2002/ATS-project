/*
 * This file was automatically generated by EvoSuite
 * Sun May 26 13:45:46 GMT 2024
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Artigo;
import Model.Malas;
import Model.Sapatilhas;
import Model.TShirt;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Artigo_ESTest extends Artigo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setCorrecaoPreco((-15));
      sapatilhas1.equals(sapatilhas0);
      assertEquals((-15.0), sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas1.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setPrecoBase((-49));
      sapatilhas1.equals(sapatilhas0);
      assertEquals((-49.0), sapatilhas1.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setNumeroDonos((-382));
      sapatilhas1.equals(sapatilhas0);
      assertEquals((-382), sapatilhas1.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Sapatilhas sapatilhas0 = new Sapatilhas((-1460), true, "Preco Final: ", localDate0, sapatilhas_Tipos_Sapatilhas0, "GK0`&JJ3,D3g<:N+c", artigo_Estado0, (-1460), artigo_Avaliacao0, "3POqj", "Ano da coleção: ", "3POqj", (-1460), (-297.532F), "GK0`&JJ3,D3g<:N+c");
      Sapatilhas sapatilhas1 = new Sapatilhas((-1460), false, "Descrição: ", localDate0, sapatilhas_Tipos_Sapatilhas0, "kwK~~AN", artigo_Estado0, (-1460), artigo_Avaliacao0, "0> DRDp,XXP+aZ5<MaK", "Material: ", "~ekgt:d[~$}u>6", 0.0, (-1460), "Material: ");
      sapatilhas0.equals(sapatilhas1);
      assertEquals("kwK~~AN", sapatilhas1.getTipo());
      assertEquals("Ano da coleção: ", sapatilhas0.getMarca());
      assertEquals("Material: ", sapatilhas1.getTransportadora());
      assertEquals("0> DRDp,XXP+aZ5<MaK", sapatilhas1.getDescricao());
      assertEquals((-1460.0), sapatilhas1.getCorrecaoPreco(), 0.01);
      assertEquals((-1460), sapatilhas1.getNumeroDonos());
      assertEquals(2, sapatilhas1.getId());
      assertEquals("GK0`&JJ3,D3g<:N+c", sapatilhas0.getTransportadora());
      assertEquals("~ekgt:d[~$}u>6", sapatilhas1.getCodigo());
      assertEquals(0.0, sapatilhas1.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      String string0 = sapatilhas0.toString(localDate0);
      assertEquals("ID: 1\nTipo: \nEstado: null\nNúmero de Donos: 0\nAvaliação: null\nDescrição: \nMarca: \nCódigo: \nPreço Base: 0.0\nCorreção do Preço: 0.0\nTransportadora: null\nTamanho Numerico: 0\nAtilhos: false\nCor: \nData de Lancamento: 0000-01-01\nTipo de Sapatilhas: null\nPreco Final: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Malas malas0 = new Malas();
      Instant instant0 = MockInstant.now();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      Clock clock0 = MockClock.fixed(instant0, zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(1, malas0.getId());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(1, true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, 1, artigo_Avaliacao0, "Model.Artigo", "", "", 1, 0.0, "");
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals("Model.Artigo", sapatilhas0.getDescricao());
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("", sapatilhas0.getMarca());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(1.0, double0, 0.01);
      assertEquals("", sapatilhas0.getTransportadora());
      assertEquals("", sapatilhas0.getCodigo());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.SATISFATORIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-2007.7224F), "", 0, "", artigo_Estado0, 2, artigo_Avaliacao0, "Cor: ", "}\"j@L#kA", (String) null, 0, 1611.54, "");
      malas0.setCorrecaoPreco((-2327.9608766887));
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals((-2327.9608766887), malas0.getCorrecaoPreco(), 0.01);
      assertEquals((-2344256.602825521), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-297.532F), "Descrição: ", (-1460), "Ano da coleção: ", artigo_Estado0, (-1460), artigo_Avaliacao0, "Descrição: ", "Descrição: ", "Descrição: ", (-297.532F), (-1460), "@5Y)9W+3pO,9!R4");
      String string0 = malas0.getTransportadora();
      assertEquals((-1460.0), malas0.getCorrecaoPreco(), 0.01);
      assertEquals("Descri\u00E7\u00E3o: ", malas0.getCodigo());
      assertEquals((-1460), malas0.getNumeroDonos());
      assertEquals("Descri\u00E7\u00E3o: ", malas0.getMarca());
      assertEquals("Ano da cole\u00E7\u00E3o: ", malas0.getTipo());
      assertEquals((-297.5320129394531), malas0.getPrecoBase(), 0.01);
      assertEquals("Descri\u00E7\u00E3o: ", malas0.getDescricao());
      assertEquals(1, malas0.getId());
      assertEquals("@5Y)9W+3pO,9!R4", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1.0F), (String) null, 967, (String) null, artigo_Estado0, 967, artigo_Avaliacao0, "4w:Flr", "4w:Flr", (String) null, 967, 967, "");
      String string0 = malas0.getTransportadora();
      assertEquals(967, malas0.getNumeroDonos());
      assertEquals(1, malas0.getId());
      assertEquals("4w:Flr", malas0.getDescricao());
      assertNotNull(string0);
      assertEquals(967.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals("", string0);
      assertEquals("4w:Flr", malas0.getMarca());
      assertEquals(967.0, malas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 826.6F, "\"", 0, "\"", artigo_Estado0, 0, artigo_Avaliacao0, (String) null, "\"", "PREMIUM", 826.6F, 0, "PREMIUM");
      String string0 = malas0.getTipo();
      assertEquals(1, malas0.getId());
      assertEquals("PREMIUM", malas0.getTransportadora());
      assertEquals("\"", malas0.getMarca());
      assertEquals("PREMIUM", malas0.getCodigo());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(826.5999755859375, malas0.getPrecoBase(), 0.01);
      assertNotNull(string0);
      assertEquals("\"", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(1, true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, 1, artigo_Avaliacao0, "Model.Artigo", "", "", 1, 0.0, "");
      sapatilhas0.setTipo("");
      sapatilhas0.getTipo();
      assertEquals(1.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("", sapatilhas0.getMarca());
      assertEquals("", sapatilhas0.getCodigo());
      assertEquals("", sapatilhas0.getTransportadora());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals("Model.Artigo", sapatilhas0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      double double0 = tShirt0.getPrecoBase();
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "\"Rf*lrlgr", artigo_Estado0, (-1), artigo_Avaliacao0, (String) null, "}a![?[ePC9d8xV", "", (-280.0), (-280.0), "q");
      double double0 = tShirt0.getPrecoBase();
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals("\"Rf*lrlgr", tShirt0.getTipo());
      assertEquals((-280.0), double0, 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals("", tShirt0.getCodigo());
      assertEquals("q", tShirt0.getTransportadora());
      assertEquals("}a![?[ePC9d8xV", tShirt0.getMarca());
      assertEquals((-280.0), tShirt0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setNumeroDonos(1876);
      int int0 = sapatilhas0.getNumeroDonos();
      assertEquals(1876, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.SATISFATORIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1070.2695F), "`m`[", (-606), "O:t;g/5]I4}H", artigo_Estado0, (-606), artigo_Avaliacao0, (String) null, "O:t;g/5]I4}H", "", (-1070.2695F), (-1070.2695F), "");
      int int0 = malas0.getNumeroDonos();
      assertEquals((-606), int0);
      assertEquals("", malas0.getCodigo());
      assertEquals("O:t;g/5]I4}H", malas0.getMarca());
      assertEquals("", malas0.getTransportadora());
      assertEquals(1, malas0.getId());
      assertEquals((-1070.26953125), malas0.getPrecoBase(), 0.01);
      assertEquals((-1070.26953125), malas0.getCorrecaoPreco(), 0.01);
      assertEquals("O:t;g/5]I4}H", malas0.getTipo());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "7yDTn,:LEed-++3", 45, "", artigo_Estado0, 45, artigo_Avaliacao0, ">#-wss", "-K'<o%>H*6aVUh~", "Material:", 0.0, 45, "-K'<o%>H*6aVUh~");
      assertEquals("-K'<o%>H*6aVUh~", malas0.getMarca());
      
      malas0.setMarca((String) null);
      malas0.getMarca();
      assertEquals(">#-wss", malas0.getDescricao());
      assertEquals(45, malas0.getNumeroDonos());
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(45.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals("", malas0.getTipo());
      assertEquals("-K'<o%>H*6aVUh~", malas0.getTransportadora());
      assertEquals(1, malas0.getId());
      assertEquals("Material:", malas0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getMarca();
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setId((-893));
      int int0 = tShirt0.getId();
      assertEquals((-893), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getEstado();
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.SATISFATORIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-6214), (String) null, (-2843), "Tipo: ", artigo_Estado0, 408, artigo_Avaliacao0, (String) null, "cCO{ipkPP%", "T/$", 1.0, (-3039.313), "U1ugvqdLSTJV=Y");
      String string0 = malas0.getDescricao();
      assertEquals("T/$", malas0.getCodigo());
      assertNull(string0);
      assertEquals(1, malas0.getId());
      assertEquals("cCO{ipkPP%", malas0.getMarca());
      assertEquals(408, malas0.getNumeroDonos());
      assertEquals("Tipo: ", malas0.getTipo());
      assertEquals("U1ugvqdLSTJV=Y", malas0.getTransportadora());
      assertEquals(1.0, malas0.getPrecoBase(), 0.01);
      assertEquals((-3039.313), malas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1.0F, "{Su:(r4kh", 0, "{Su:(r4kh", artigo_Estado0, 0, artigo_Avaliacao0, "S", (String) null, (String) null, 1.0F, 1.0F, "DwrrdM");
      String string0 = malas0.getDescricao();
      assertEquals(1, malas0.getId());
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(1.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals("S", string0);
      assertEquals("{Su:(r4kh", malas0.getTipo());
      assertEquals("DwrrdM", malas0.getTransportadora());
      assertNotNull(string0);
      assertEquals(1.0, malas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "NORMAL", (-707), (String) null, artigo_Estado0, 2147483645, artigo_Avaliacao0, "Model.Malas", "NORMAL", "Número de Donos: ", 0.0F, 2147483645, (String) null);
      double double0 = malas0.getCorrecaoPreco();
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals("Número de Donos: ", malas0.getCodigo());
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals("NORMAL", malas0.getMarca());
      assertEquals("Model.Malas", malas0.getDescricao());
      assertEquals(2.147483645E9, double0, 0.01);
      assertEquals(1, malas0.getId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setCorrecaoPreco((-191.8143031248));
      double double0 = tShirt0.getCorrecaoPreco();
      assertEquals((-191.8143031248), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDate localDate0 = MockLocalDate.now(zoneId0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.SATISFATORIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, true, (String) null, localDate0, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, 1, artigo_Avaliacao0, "", (String) null, (String) null, 749.82702860895, (-358.37768), "V+[>)[Q<UgG#");
      String string0 = sapatilhas0.getCodigo();
      assertEquals(1, sapatilhas0.getId());
      assertEquals((-358.37768), sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("V+[>)[Q<UgG#", sapatilhas0.getTransportadora());
      assertEquals("", sapatilhas0.getDescricao());
      assertNull(string0);
      assertEquals(749.82702860895, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "chnyP/&", artigo_Estado0, (-1), artigo_Avaliacao0, "Cor: ", "Cor: ", "Data de Lancamento: ", 251.68, (-2091.5628781534), "SATISFATORIO");
      String string0 = tShirt0.getCodigo();
      assertEquals((-2091.5628781534), tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(251.68, tShirt0.getPrecoBase(), 0.01);
      assertEquals((-1), tShirt0.getNumeroDonos());
      assertEquals("Data de Lancamento: ", string0);
      assertEquals("Cor: ", tShirt0.getDescricao());
      assertEquals("SATISFATORIO", tShirt0.getTransportadora());
      assertEquals("chnyP/&", tShirt0.getTipo());
      assertEquals(1, tShirt0.getId());
      assertEquals("Cor: ", tShirt0.getMarca());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.IMPECAVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 826.6F, "\"", 0, "\"", artigo_Estado0, 0, artigo_Avaliacao0, (String) null, "\"", "PREMIUM", 826.6F, 0, "PREMIUM");
      malas0.getAvaliacao();
      assertEquals(826.5999755859375, malas0.getPrecoBase(), 0.01);
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals("\"", malas0.getTipo());
      assertEquals("PREMIUM", malas0.getCodigo());
      assertEquals(1, malas0.getId());
      assertEquals("PREMIUM", malas0.getTransportadora());
      assertEquals("\"", malas0.getMarca());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.equals(tShirt0);
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(1, tShirt0.getId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.SATISFATORIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1070.2695F), "`m`[", (-606), "O:t;g/5]I4}H", artigo_Estado0, (-606), artigo_Avaliacao0, (String) null, "O:t;g/5]I4}H", "", (-1070.2695F), (-1070.2695F), "");
      malas0.setId((-606));
      malas0.clone();
      assertEquals((-606), malas0.getId());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.SATISFATORIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "Tipo de mala: ", 2, "Tipo de mala: ", artigo_Estado0, 2, artigo_Avaliacao0, "Tipo de mala: ", "Tipo de mala: ", "uTq<@tt.{bS", 644.907, 0.0F, "]mMj0bDgv}@H! }d7j:");
      Artigo artigo0 = malas0.clone();
      assertEquals("Tipo de mala: ", artigo0.getDescricao());
      assertEquals("Tipo de mala: ", artigo0.getTipo());
      assertEquals(1, artigo0.getId());
      assertEquals("uTq<@tt.{bS", artigo0.getCodigo());
      assertEquals(2, artigo0.getNumeroDonos());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(644.907, malas0.getPrecoBase(), 0.01);
      assertEquals(2, malas0.getNumeroDonos());
      assertEquals(644.907, artigo0.getPrecoBase(), 0.01);
      assertEquals(1, malas0.getId());
      assertEquals("Tipo de mala: ", artigo0.getMarca());
      assertEquals("]mMj0bDgv}@H! }d7j:", artigo0.getTransportadora());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setCorrecaoPreco(2118.3426563);
      malas0.clone();
      assertEquals(2118.3426563, malas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Malas malas0 = new Malas();
      // Undeclared exception!
      try { 
        malas0.toString((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Malas malas0 = new Malas();
      // Undeclared exception!
      try { 
        malas0.precoFinal((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      // Undeclared exception!
      try { 
        sapatilhas1.equals(sapatilhas0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getTransportadora();
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(1, malas0.getId());
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliacao artigo_Avaliacao0 = Artigo.Avaliacao.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(1, true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, 1, artigo_Avaliacao0, "Model.Artigo", "", "", 1, 0.0, "");
      double double0 = sapatilhas0.getPrecoBase();
      assertEquals("", sapatilhas0.getTransportadora());
      assertEquals(1.0, double0, 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("", sapatilhas0.getMarca());
      assertEquals("", sapatilhas0.getCodigo());
      assertEquals("Model.Artigo", sapatilhas0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getAvaliacao();
      assertEquals(1, malas0.getId());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(0, malas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getDescricao();
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, malas0.getId());
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Malas malas0 = new Malas();
      double double0 = malas0.getCorrecaoPreco();
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, malas0.getId());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getCodigo();
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, malas0.getId());
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setTransportadora("");
      sapatilhas1.equals(sapatilhas0);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setCorrecaoPreco(3);
      sapatilhas1.equals(sapatilhas0);
      assertEquals(3.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas1.getId());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setPrecoBase(3);
      sapatilhas1.equals(sapatilhas0);
      assertEquals(3.0, sapatilhas1.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setTipo("M");
      sapatilhas0.setTipo("M");
      sapatilhas0.setCodigo("M");
      sapatilhas1.equals(sapatilhas0);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setMarca("Material: ");
      sapatilhas1.equals(sapatilhas0);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(1, sapatilhas1.getId());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setNumeroDonos((-1994091956));
      sapatilhas1.equals(sapatilhas0);
      assertEquals((-1994091956), sapatilhas0.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      sapatilhas0.setEstado(artigo_Estado0);
      sapatilhas1.equals(sapatilhas0);
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setTipo("NORMAL");
      sapatilhas1.equals(sapatilhas0);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas();
      sapatilhas1.equals(sapatilhas0);
      assertEquals(2, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas1.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas1.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setDescricao("S");
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setDescricao("S");
      sapatilhas1.equals(sapatilhas0);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }
}