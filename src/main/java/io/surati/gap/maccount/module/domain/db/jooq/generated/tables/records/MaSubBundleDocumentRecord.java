/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.maccount.module.domain.db.jooq.generated.tables.records;


import io.surati.gap.maccount.module.domain.db.jooq.generated.tables.MaSubBundleDocument;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MaSubBundleDocumentRecord extends UpdatableRecordImpl<MaSubBundleDocumentRecord> implements Record8<Long, Integer, Long, Short, Double, Double, Double, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.ma_sub_bundle_document.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.no</code>.
     */
    public void setNo(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.no</code>.
     */
    public Integer getNo() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.reference_document_id</code>.
     */
    public void setReferenceDocumentId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.reference_document_id</code>.
     */
    public Long getReferenceDocumentId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.year</code>.
     */
    public void setYear(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.year</code>.
     */
    public Short getYear() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.amount_paid_before</code>.
     */
    public void setAmountPaidBefore(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.amount_paid_before</code>.
     */
    public Double getAmountPaidBefore() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.annual_amount_paid</code>.
     */
    public void setAnnualAmountPaid(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.annual_amount_paid</code>.
     */
    public Double getAnnualAmountPaid() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.amount_left</code>.
     */
    public void setAmountLeft(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.amount_left</code>.
     */
    public Double getAmountLeft() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.ma_sub_bundle_document.sub_bundle_id</code>.
     */
    public void setSubBundleId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.ma_sub_bundle_document.sub_bundle_id</code>.
     */
    public Long getSubBundleId() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Integer, Long, Short, Double, Double, Double, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Integer, Long, Short, Double, Double, Double, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.ID;
    }

    @Override
    public Field<Integer> field2() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.NO;
    }

    @Override
    public Field<Long> field3() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.REFERENCE_DOCUMENT_ID;
    }

    @Override
    public Field<Short> field4() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.YEAR;
    }

    @Override
    public Field<Double> field5() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.AMOUNT_PAID_BEFORE;
    }

    @Override
    public Field<Double> field6() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.ANNUAL_AMOUNT_PAID;
    }

    @Override
    public Field<Double> field7() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.AMOUNT_LEFT;
    }

    @Override
    public Field<Long> field8() {
        return MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT.SUB_BUNDLE_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getNo();
    }

    @Override
    public Long component3() {
        return getReferenceDocumentId();
    }

    @Override
    public Short component4() {
        return getYear();
    }

    @Override
    public Double component5() {
        return getAmountPaidBefore();
    }

    @Override
    public Double component6() {
        return getAnnualAmountPaid();
    }

    @Override
    public Double component7() {
        return getAmountLeft();
    }

    @Override
    public Long component8() {
        return getSubBundleId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getNo();
    }

    @Override
    public Long value3() {
        return getReferenceDocumentId();
    }

    @Override
    public Short value4() {
        return getYear();
    }

    @Override
    public Double value5() {
        return getAmountPaidBefore();
    }

    @Override
    public Double value6() {
        return getAnnualAmountPaid();
    }

    @Override
    public Double value7() {
        return getAmountLeft();
    }

    @Override
    public Long value8() {
        return getSubBundleId();
    }

    @Override
    public MaSubBundleDocumentRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value2(Integer value) {
        setNo(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value3(Long value) {
        setReferenceDocumentId(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value4(Short value) {
        setYear(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value5(Double value) {
        setAmountPaidBefore(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value6(Double value) {
        setAnnualAmountPaid(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value7(Double value) {
        setAmountLeft(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord value8(Long value) {
        setSubBundleId(value);
        return this;
    }

    @Override
    public MaSubBundleDocumentRecord values(Long value1, Integer value2, Long value3, Short value4, Double value5, Double value6, Double value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MaSubBundleDocumentRecord
     */
    public MaSubBundleDocumentRecord() {
        super(MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT);
    }

    /**
     * Create a detached, initialised MaSubBundleDocumentRecord
     */
    public MaSubBundleDocumentRecord(Long id, Integer no, Long referenceDocumentId, Short year, Double amountPaidBefore, Double annualAmountPaid, Double amountLeft, Long subBundleId) {
        super(MaSubBundleDocument.MA_SUB_BUNDLE_DOCUMENT);

        setId(id);
        setNo(no);
        setReferenceDocumentId(referenceDocumentId);
        setYear(year);
        setAmountPaidBefore(amountPaidBefore);
        setAnnualAmountPaid(annualAmountPaid);
        setAmountLeft(amountLeft);
        setSubBundleId(subBundleId);
    }
}
