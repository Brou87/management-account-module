/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.maccount.module.domain.db.jooq.generated.tables.records;


import io.surati.gap.maccount.module.domain.db.jooq.generated.tables.MaDocumentToBundleView;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MaDocumentToBundleViewRecord extends TableRecordImpl<MaDocumentToBundleViewRecord> implements Record12<Long, String, Long, Double, Double, Double, String, Integer, Integer, Integer, Double, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.ma_document_to_bundle_view.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.reference</code>.
     */
    public void setReference(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.reference</code>.
     */
    public String getReference() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.beneficiary_id</code>.
     */
    public void setBeneficiaryId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.beneficiary_id</code>.
     */
    public Long getBeneficiaryId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.year_of_payment</code>.
     */
    public void setYearOfPayment(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.year_of_payment</code>.
     */
    public Double getYearOfPayment() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.total_amount</code>.
     */
    public void setTotalAmount(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.total_amount</code>.
     */
    public Double getTotalAmount() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.annual_amount_paid</code>.
     */
    public void setAnnualAmountPaid(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.annual_amount_paid</code>.
     */
    public Double getAnnualAmountPaid() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.imputation</code>.
     */
    public void setImputation(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.imputation</code>.
     */
    public String getImputation() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.bundle_id</code>.
     */
    public void setBundleId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.bundle_id</code>.
     */
    public Integer getBundleId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.title_id</code>.
     */
    public void setTitleId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.title_id</code>.
     */
    public Integer getTitleId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.section_id</code>.
     */
    public void setSectionId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.section_id</code>.
     */
    public Integer getSectionId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.left_amount</code>.
     */
    public void setLeftAmount(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.left_amount</code>.
     */
    public Double getLeftAmount() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.ma_document_to_bundle_view.is_split</code>.
     */
    public void setIsSplit(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.ma_document_to_bundle_view.is_split</code>.
     */
    public Boolean getIsSplit() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, Long, Double, Double, Double, String, Integer, Integer, Integer, Double, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, Long, Double, Double, Double, String, Integer, Integer, Integer, Double, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.ID;
    }

    @Override
    public Field<String> field2() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.REFERENCE;
    }

    @Override
    public Field<Long> field3() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.BENEFICIARY_ID;
    }

    @Override
    public Field<Double> field4() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.YEAR_OF_PAYMENT;
    }

    @Override
    public Field<Double> field5() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.TOTAL_AMOUNT;
    }

    @Override
    public Field<Double> field6() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.ANNUAL_AMOUNT_PAID;
    }

    @Override
    public Field<String> field7() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.IMPUTATION;
    }

    @Override
    public Field<Integer> field8() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.BUNDLE_ID;
    }

    @Override
    public Field<Integer> field9() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.TITLE_ID;
    }

    @Override
    public Field<Integer> field10() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.SECTION_ID;
    }

    @Override
    public Field<Double> field11() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.LEFT_AMOUNT;
    }

    @Override
    public Field<Boolean> field12() {
        return MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW.IS_SPLIT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getReference();
    }

    @Override
    public Long component3() {
        return getBeneficiaryId();
    }

    @Override
    public Double component4() {
        return getYearOfPayment();
    }

    @Override
    public Double component5() {
        return getTotalAmount();
    }

    @Override
    public Double component6() {
        return getAnnualAmountPaid();
    }

    @Override
    public String component7() {
        return getImputation();
    }

    @Override
    public Integer component8() {
        return getBundleId();
    }

    @Override
    public Integer component9() {
        return getTitleId();
    }

    @Override
    public Integer component10() {
        return getSectionId();
    }

    @Override
    public Double component11() {
        return getLeftAmount();
    }

    @Override
    public Boolean component12() {
        return getIsSplit();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getReference();
    }

    @Override
    public Long value3() {
        return getBeneficiaryId();
    }

    @Override
    public Double value4() {
        return getYearOfPayment();
    }

    @Override
    public Double value5() {
        return getTotalAmount();
    }

    @Override
    public Double value6() {
        return getAnnualAmountPaid();
    }

    @Override
    public String value7() {
        return getImputation();
    }

    @Override
    public Integer value8() {
        return getBundleId();
    }

    @Override
    public Integer value9() {
        return getTitleId();
    }

    @Override
    public Integer value10() {
        return getSectionId();
    }

    @Override
    public Double value11() {
        return getLeftAmount();
    }

    @Override
    public Boolean value12() {
        return getIsSplit();
    }

    @Override
    public MaDocumentToBundleViewRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value2(String value) {
        setReference(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value3(Long value) {
        setBeneficiaryId(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value4(Double value) {
        setYearOfPayment(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value5(Double value) {
        setTotalAmount(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value6(Double value) {
        setAnnualAmountPaid(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value7(String value) {
        setImputation(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value8(Integer value) {
        setBundleId(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value9(Integer value) {
        setTitleId(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value10(Integer value) {
        setSectionId(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value11(Double value) {
        setLeftAmount(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord value12(Boolean value) {
        setIsSplit(value);
        return this;
    }

    @Override
    public MaDocumentToBundleViewRecord values(Long value1, String value2, Long value3, Double value4, Double value5, Double value6, String value7, Integer value8, Integer value9, Integer value10, Double value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MaDocumentToBundleViewRecord
     */
    public MaDocumentToBundleViewRecord() {
        super(MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW);
    }

    /**
     * Create a detached, initialised MaDocumentToBundleViewRecord
     */
    public MaDocumentToBundleViewRecord(Long id, String reference, Long beneficiaryId, Double yearOfPayment, Double totalAmount, Double annualAmountPaid, String imputation, Integer bundleId, Integer titleId, Integer sectionId, Double leftAmount, Boolean isSplit) {
        super(MaDocumentToBundleView.MA_DOCUMENT_TO_BUNDLE_VIEW);

        setId(id);
        setReference(reference);
        setBeneficiaryId(beneficiaryId);
        setYearOfPayment(yearOfPayment);
        setTotalAmount(totalAmount);
        setAnnualAmountPaid(annualAmountPaid);
        setImputation(imputation);
        setBundleId(bundleId);
        setTitleId(titleId);
        setSectionId(sectionId);
        setLeftAmount(leftAmount);
        setIsSplit(isSplit);
    }
}