/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.maccount.module.domain.db.jooq.generated.tables;


import io.surati.gap.maccount.module.domain.db.jooq.generated.Keys;
import io.surati.gap.maccount.module.domain.db.jooq.generated.Public;
import io.surati.gap.maccount.module.domain.db.jooq.generated.tables.records.MaSubBundleDocumentRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class MaSubBundleDocument extends TableImpl<MaSubBundleDocumentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.ma_sub_bundle_document</code>
     */
    public static final MaSubBundleDocument MA_SUB_BUNDLE_DOCUMENT = new MaSubBundleDocument();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MaSubBundleDocumentRecord> getRecordType() {
        return MaSubBundleDocumentRecord.class;
    }

    /**
     * The column <code>public.ma_sub_bundle_document.id</code>.
     */
    public final TableField<MaSubBundleDocumentRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.ma_sub_bundle_document.sub_bundle_id</code>.
     */
    public final TableField<MaSubBundleDocumentRecord, Long> SUB_BUNDLE_ID = createField(DSL.name("sub_bundle_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private MaSubBundleDocument(Name alias, Table<MaSubBundleDocumentRecord> aliased) {
        this(alias, aliased, null);
    }

    private MaSubBundleDocument(Name alias, Table<MaSubBundleDocumentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.ma_sub_bundle_document</code> table reference
     */
    public MaSubBundleDocument(String alias) {
        this(DSL.name(alias), MA_SUB_BUNDLE_DOCUMENT);
    }

    /**
     * Create an aliased <code>public.ma_sub_bundle_document</code> table reference
     */
    public MaSubBundleDocument(Name alias) {
        this(alias, MA_SUB_BUNDLE_DOCUMENT);
    }

    /**
     * Create a <code>public.ma_sub_bundle_document</code> table reference
     */
    public MaSubBundleDocument() {
        this(DSL.name("ma_sub_bundle_document"), null);
    }

    public <O extends Record> MaSubBundleDocument(Table<O> child, ForeignKey<O, MaSubBundleDocumentRecord> key) {
        super(child, key, MA_SUB_BUNDLE_DOCUMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<ForeignKey<MaSubBundleDocumentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MaSubBundleDocumentRecord, ?>>asList(Keys.MA_SUB_BUNDLE_DOCUMENT__MA_SUB_BUNDLE_DOCUMENT_SUB_BUNDLE_ID_FKEY);
    }

    private transient MaSubBundle _maSubBundle;

    public MaSubBundle maSubBundle() {
        if (_maSubBundle == null)
            _maSubBundle = new MaSubBundle(this, Keys.MA_SUB_BUNDLE_DOCUMENT__MA_SUB_BUNDLE_DOCUMENT_SUB_BUNDLE_ID_FKEY);

        return _maSubBundle;
    }

    @Override
    public MaSubBundleDocument as(String alias) {
        return new MaSubBundleDocument(DSL.name(alias), this);
    }

    @Override
    public MaSubBundleDocument as(Name alias) {
        return new MaSubBundleDocument(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MaSubBundleDocument rename(String name) {
        return new MaSubBundleDocument(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MaSubBundleDocument rename(Name name) {
        return new MaSubBundleDocument(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
