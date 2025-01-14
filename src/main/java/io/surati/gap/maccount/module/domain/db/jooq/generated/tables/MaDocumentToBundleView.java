/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.maccount.module.domain.db.jooq.generated.tables;


import io.surati.gap.maccount.module.domain.db.jooq.generated.Public;
import io.surati.gap.maccount.module.domain.db.jooq.generated.tables.records.MaDocumentToBundleViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MaDocumentToBundleView extends TableImpl<MaDocumentToBundleViewRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.ma_document_to_bundle_view</code>
     */
    public static final MaDocumentToBundleView MA_DOCUMENT_TO_BUNDLE_VIEW = new MaDocumentToBundleView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MaDocumentToBundleViewRecord> getRecordType() {
        return MaDocumentToBundleViewRecord.class;
    }

    /**
     * The column <code>public.ma_document_to_bundle_view.id</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.reference</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, String> REFERENCE = createField(DSL.name("reference"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.beneficiary_id</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Long> BENEFICIARY_ID = createField(DSL.name("beneficiary_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.year_of_payment</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Double> YEAR_OF_PAYMENT = createField(DSL.name("year_of_payment"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.total_amount</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Double> TOTAL_AMOUNT = createField(DSL.name("total_amount"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.annual_amount_paid</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Double> ANNUAL_AMOUNT_PAID = createField(DSL.name("annual_amount_paid"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.imputation</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, String> IMPUTATION = createField(DSL.name("imputation"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.bundle_id</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Integer> BUNDLE_ID = createField(DSL.name("bundle_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.title_id</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Integer> TITLE_ID = createField(DSL.name("title_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.section_id</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Integer> SECTION_ID = createField(DSL.name("section_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.left_amount</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Double> LEFT_AMOUNT = createField(DSL.name("left_amount"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.ma_document_to_bundle_view.is_split</code>.
     */
    public final TableField<MaDocumentToBundleViewRecord, Boolean> IS_SPLIT = createField(DSL.name("is_split"), SQLDataType.BOOLEAN, this, "");

    private MaDocumentToBundleView(Name alias, Table<MaDocumentToBundleViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private MaDocumentToBundleView(Name alias, Table<MaDocumentToBundleViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"ma_document_to_bundle_view\" as  SELECT t2.id,\n    t2.reference,\n    t2.beneficiary_id,\n    t2.year_of_payment,\n    t2.total_amount,\n    t2.annual_amount_paid,\n    data.imputation,\n    data.bundle_id,\n    data.title_id,\n    data.section_id,\n    (t2.total_amount - t2.annual_amount_paid) AS left_amount,\n    (t2.total_amount > t2.annual_amount_paid) AS is_split\n   FROM (( SELECT t1.id,\n            t1.reference,\n            t1.beneficiary_id,\n            t1.year_of_payment,\n            t1.total_amount,\n            sum(t1.annual_amount_paid) AS annual_amount_paid\n           FROM ( SELECT doc.id,\n                    po.beneficiary_id,\n                    doc.reference,\n                    doc.amount AS total_amount,\n                    date_part('year'::text, (pay.date)::date) AS year_of_payment,\n                    po.amount_to_pay AS annual_amount_paid\n                   FROM ((pay_payment_order po\n                     LEFT JOIN pay_reference_document doc ON ((doc.id = po.reference_document_id)))\n                     LEFT JOIN pay_payment pay ON ((pay.group_id = po.group_id)))\n                  WHERE ((pay.status_id)::text = 'ISSUED'::text)) t1\n          GROUP BY t1.id, t1.reference, t1.beneficiary_id, t1.year_of_payment, t1.total_amount) t2\n     LEFT JOIN ma_data data ON ((data.id = t2.id)));"));
    }

    /**
     * Create an aliased <code>public.ma_document_to_bundle_view</code> table reference
     */
    public MaDocumentToBundleView(String alias) {
        this(DSL.name(alias), MA_DOCUMENT_TO_BUNDLE_VIEW);
    }

    /**
     * Create an aliased <code>public.ma_document_to_bundle_view</code> table reference
     */
    public MaDocumentToBundleView(Name alias) {
        this(alias, MA_DOCUMENT_TO_BUNDLE_VIEW);
    }

    /**
     * Create a <code>public.ma_document_to_bundle_view</code> table reference
     */
    public MaDocumentToBundleView() {
        this(DSL.name("ma_document_to_bundle_view"), null);
    }

    public <O extends Record> MaDocumentToBundleView(Table<O> child, ForeignKey<O, MaDocumentToBundleViewRecord> key) {
        super(child, key, MA_DOCUMENT_TO_BUNDLE_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public MaDocumentToBundleView as(String alias) {
        return new MaDocumentToBundleView(DSL.name(alias), this);
    }

    @Override
    public MaDocumentToBundleView as(Name alias) {
        return new MaDocumentToBundleView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MaDocumentToBundleView rename(String name) {
        return new MaDocumentToBundleView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MaDocumentToBundleView rename(Name name) {
        return new MaDocumentToBundleView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, Long, Double, Double, Double, String, Integer, Integer, Integer, Double, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
