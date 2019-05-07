/**
 *
 */
package org.openmrs.module.mohdataflowmodule.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author Kamonyo
 *
 */
public class MohDataFlowPrintDischargeController extends AbstractController {

    // private Log log = LogFactory.getLog(this.getClass());

    /**
     * (non-Javadoc)
     *
     * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal
     *      (javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {
        return null;
    }
    //
    // printPatientBillToPDF(request, response);
    //
    // return null;
    // }
    //
    // private void printPatientBillToPDF(HttpServletRequest request,
    // HttpServletResponse response) throws Exception {
    // Document document = new Document();
    //
    // PatientBill pb = null;
    //
    // pb = Context.getService(BillingService.class).getPatientBill(
    // Integer.parseInt(request.getParameter("patientBillId")));
    //
    // String filename = pb.getBeneficiary().getPatient().getPersonName()
    // .toString().replace(" ", "_");
    // filename = pb.getBeneficiary().getPolicyIdNumber().replace(" ", "_")
    // + "_" + filename + ".pdf";
    //
    // response.setContentType("application/pdf");
    // response.setHeader("Content-Disposition", "attachment; filename=\""
    // + filename + "\""); // file name
    //
    // PdfWriter writer = PdfWriter.getInstance(document, response
    // .getOutputStream());
    // // writer.setBoxSize("art", new Rectangle(0, 0, 2382, 3369));
    // writer.setBoxSize("art", PageSize.A4);
    //
    // HeaderFooter event = new HeaderFooter();
    // writer.setPageEvent(event);
    //
    // document.open();
    // document.setPageSize(PageSize.A4);
    // // document.setPageSize(new Rectangle(0, 0, 2382, 3369));
    //
    // document.addAuthor(Context.getAuthenticatedUser().getPersonName()
    // .toString());// the name of the author
    //
    // FontSelector fontTitle = new FontSelector();
    // fontTitle.addFont(new Font(FontFamily.COURIER, 10.0f, Font.BOLD));
    //
    // // Report title
    // Chunk chk = new Chunk("Printed on : "
    // + (new SimpleDateFormat("dd-MMM-yyyy").format(new Date())));
    // chk.setFont(new Font(FontFamily.COURIER, 10.0f, Font.BOLD));
    // Paragraph todayDate = new Paragraph();
    // todayDate.setAlignment(Element.ALIGN_RIGHT);
    // todayDate.add(chk);
    // document.add(todayDate);
    //
    // document.add(fontTitle.process("REPUBLIQUE DU RWANDA\n"));
    // document.add(fontTitle.process("POLICE NATIONALE\n"));
    // document.add(fontTitle.process("KACYIRU POLICE HOSPITAL\n"));
    // document.add(fontTitle.process("B.P. 6183 KIGALI\n"));
    // document.add(fontTitle.process("Tél : 584897\n"));
    // document.add(fontTitle.process("E-mail : medical@police.gov.rw"));
    // // End Report title
    //
    // document.add(new Paragraph("\n"));
    // chk = new Chunk("FEUILLE DE SOINS VALANT PRISE EN CHARGE");
    // chk.setFont(new Font(FontFamily.COURIER, 10.0f, Font.BOLD));
    // chk.setUnderline(0.2f, -2f);
    // Paragraph pa = new Paragraph();
    // pa.add(chk);
    // pa.setAlignment(Element.ALIGN_CENTER);
    // document.add(pa);
    // document.add(new Paragraph("\n"));
    //
    // // title row
    // FontSelector fontTitleSelector = new FontSelector();
    // fontTitleSelector.addFont(new Font(FontFamily.COURIER, 9, Font.BOLD));
    //
    // PdfPTable tableHeader = new PdfPTable(1);
    // tableHeader.setWidthPercentage(100f);
    //
    // // Table of identification;
    // PdfPTable table = null;
    // table = new PdfPTable(2);
    // table.setWidthPercentage(100f);
    //
    // PdfPCell cell = new PdfPCell(fontTitleSelector
    // .process("Compagnie d'Assurance : "
    // + pb.getBeneficiary().getInsurancePolicy()
    // .getInsurance().getName()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Tél : "
    // + pb.getBeneficiary().getInsurancePolicy().getInsurance()
    // .getPhone()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Noms du malade : "
    // + pb.getBeneficiary().getPatient().getPersonName()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Date de Naissance : "
    // + new SimpleDateFormat("dd-MMM-yyyy").format(pb
    // .getBeneficiary().getPatient().getBirthdate())));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector
    // .process("Noms de l'assure Principal : "
    // + pb.getBeneficiary().getInsurancePolicy().getOwner()
    // .getPersonName()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector
    // .process("Numero Carte d'assure : "
    // + pb.getBeneficiary().getInsurancePolicy()
    // .getInsuranceCardNo()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // tableHeader.addCell(table);
    //
    // document.add(tableHeader);
    //
    // document.add(new Paragraph("\n"));
    //
    // // Table of bill items;
    // float[] colsWidth = { 2f, 15f, 2f, 3.5f, 5f, 5f, 5f };
    // table = new PdfPTable(colsWidth);
    // table.setWidthPercentage(100f);
    // BaseColor bckGroundTitle = new BaseColor(170, 170, 170);
    //
    // // table Header
    // cell = new PdfPCell(fontTitleSelector.process("No."));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Services"));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Qnty"));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Unit Price (Rwf)"));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Price (Rwf)"));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Insurance ("
    // + pb.getBeneficiary().getInsurancePolicy().getInsurance()
    // .getCurrentRate().getRate() + "%)"));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Patient ("
    // + (100 - pb.getBeneficiary().getInsurancePolicy()
    // .getInsurance().getCurrentRate().getRate()) + "%)"));
    // cell.setBackgroundColor(bckGroundTitle);
    // table.addCell(cell);
    //
    // // normal row
    // FontSelector fontselector = new FontSelector();
    // fontselector.addFont(new Font(FontFamily.COURIER, 8, Font.NORMAL));
    //
    // // empty row
    // FontSelector fontTotals = new FontSelector();
    // fontTotals.addFont(new Font(FontFamily.COURIER, 9, Font.BOLD));
    //
    // int ids = 0;
    // Double totalToBePaidOnService = 0.0;
    // Double totalToBePaidByInsurance = 0.0, totalToBePaidOnServiceByInsurance
    // = 0.0;
    // Double totalToBePaidByPatient = 0.0, totalToBePaidOnServiceByPatient =
    // 0.0;
    //
    // for (PatientServiceBill psb : pb.getBillItems()) {
    // ids += 1;
    //
    // // initialize total amount to be paid on a service
    // totalToBePaidOnService = 0.0;
    // totalToBePaidOnServiceByInsurance = 0.0;
    // totalToBePaidOnServiceByPatient = 0.0;
    //
    // cell = new PdfPCell(fontselector.process(ids + "."));
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontselector.process(psb.getService()
    // .getFacilityServicePrice().getName()));
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontselector.process("" + psb.getQuantity()));
    // cell.setHorizontalAlignment(Element.ALIGN_CENTER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontselector.process("" + psb.getUnitPrice()));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    //
    // totalToBePaidOnService = (psb.getQuantity() * psb.getUnitPrice()
    // .doubleValue());
    //
    // cell = new PdfPCell(fontselector.process(""
    // + totalToBePaidOnService));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    //
    // totalToBePaidOnServiceByInsurance = ((totalToBePaidOnService * (pb
    // .getBeneficiary().getInsurancePolicy().getInsurance()
    // .getCurrentRate().getRate())) / 100);
    // totalToBePaidByInsurance += totalToBePaidOnServiceByInsurance;
    // cell = new PdfPCell(fontselector.process(""
    // + totalToBePaidOnServiceByInsurance));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    //
    // totalToBePaidOnServiceByPatient = ((totalToBePaidOnService * (100 - pb
    // .getBeneficiary().getInsurancePolicy().getInsurance()
    // .getCurrentRate().getRate())) / 100);
    // totalToBePaidByPatient += totalToBePaidOnServiceByPatient;
    // cell = new PdfPCell(fontselector.process(""
    // + totalToBePaidOnServiceByPatient));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    // }
    //
    // // Total for each part, insurance & patient
    // cell = new PdfPCell(fontselector.process("Total : "));
    // cell.setColspan(5);
    // cell.setBorder(Rectangle.NO_BORDER);
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTotals.process("" + totalToBePaidByInsurance));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // cell.setBackgroundColor(new BaseColor(201, 218, 255));
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTotals.process("" + totalToBePaidByPatient));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // cell.setBackgroundColor(new BaseColor(201, 218, 255));
    // table.addCell(cell);
    //
    // // Amount Paid
    // cell = new PdfPCell(fontselector.process("Amount Paid : "));
    // cell.setColspan(6);
    // cell.setBorder(Rectangle.NO_BORDER);
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTotals.process(""
    // + MohBillingTagUtil.getTotalAmountPaidByPatientBill(pb
    // .getPatientBillId())));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // cell.setBackgroundColor(new BaseColor(201, 218, 255));
    // table.addCell(cell);
    //
    // // Rest to be Paid
    // cell = new PdfPCell(fontselector.process("Rest : "));
    // cell.setColspan(6);
    // cell.setBorder(Rectangle.NO_BORDER);
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTotals.process(""
    // + MohBillingTagUtil.getTotalAmountNotPaidByPatientBill(pb
    // .getPatientBillId())));
    // cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    // cell.setBackgroundColor(new BaseColor(201, 218, 255));
    // table.addCell(cell);
    //
    // document.add(table);
    //
    // document.add(new Paragraph("\n\n"));
    //
    // // Table of signatures;
    // table = new PdfPTable(2);
    // table.setWidthPercentage(100f);
    //
    // cell = new PdfPCell(fontTitleSelector.process("Signature de l'Assure\n"
    // + pb.getBeneficiary().getPatient().getPersonName()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // cell = new PdfPCell(fontTitleSelector
    // .process("Noms, Signature et Cachet du Prestataire des soins\n"
    // + Context.getAuthenticatedUser().getPersonName()));
    // cell.setBorder(Rectangle.NO_BORDER);
    // table.addCell(cell);
    //
    // document.add(table);
    //
    // document.close();
    //
    // // log.info("pdf file created");
    // }
    //
    // static class HeaderFooter extends PdfPageEventHelper {
    // public void onEndPage(PdfWriter writer, Document document) {
    // Rectangle rect = writer.getBoxSize("art");
    //
    // Phrase header = new Phrase(String.format("- %d -", writer
    // .getPageNumber()));
    // header.setFont(new Font(FontFamily.COURIER, 4, Font.NORMAL));
    //
    // if (document.getPageNumber() > 1) {
    // ColumnText.showTextAligned(writer.getDirectContent(),
    // Element.ALIGN_CENTER, header, (rect.getLeft() + rect
    // .getRight()) / 2, rect.getTop() + 40, 0);
    // }
    //
    // Phrase footer = new Phrase(String.format("- %d -", writer
    // .getPageNumber()));
    // footer.setFont(new Font(FontFamily.COURIER, 4, Font.NORMAL));
    //
    // ColumnText.showTextAligned(writer.getDirectContent(),
    // Element.ALIGN_CENTER, footer, (rect.getLeft() + rect
    // .getRight()) / 2, rect.getBottom() - 40, 0);
    //
    // }
    // }

}