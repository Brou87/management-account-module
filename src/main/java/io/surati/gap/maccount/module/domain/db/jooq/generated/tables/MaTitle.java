/*
 * This file is generated by jOOQ.
 */
package io.surati.gap.maccount.module.domain.db.jooq.generated.tables;


import io.surati.gap.maccount.module.domain.db.jooq.generated.Keys;
import io.surati.gap.maccount.module.domain.db.jooq.generated.Public;
import io.surati.gap.maccount.module.domain.db.jooq.generated.tables.records.MaTitleRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MaTitle extends TableImpl<MaTitleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.ma_title</code>
     */
    public static final MaTitle MA_TITLE = new MaTitle();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MaTitleRecord> getRecordType() {
        return MaTitleRecord.class;
    }

    /**
     * The column <code>public.ma_title.id</code>.
     */
    public final TableField<MaTitleRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.ma_title.code</code>.
     */
    public final TableField<MaTitleRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.ma_title.name</code>.
     */
    public final TableField<MaTitleRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>public.ma_title.notes</code>.
     */
    public final TableField<MaTitleRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR(250), this, "");

    private MaTitle(Name alias, Table<MaTitleRecord> aliased) {
        this(alias, aliased, null);
    }

    private MaTitle(Name alias, Table<MaTitleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.ma_title</code> table reference
     */
    public MaTitle(String alias) {
        this(DSL.name(alias), MA_TITLE);
    }

    /**
     * Create an aliased <code>public.ma_title</code> table reference
     */
    public MaTitle(Name alias) {
        this(alias, MA_TITLE);
    }

    /**
     * Create a <code>public.ma_title</code> table reference
     */
    public MaTitle() {
        this(DSL.name("ma_title"), null);
    }

    public <O extends Record> MaTitle(Table<O> child, ForeignKey<O, MaTitleRecord> key) {
        super(child, key, MA_TITLE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<MaTitleRecord, Long> getIdentity() {
        return (Identity<MaTitleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MaTitleRecord> getPrimaryKey() {
        return Keys.MA_TITLE_PKEY;
    }

    @Override
    public List<UniqueKey<MaTitleRecord>> getKeys() {
        return Arrays.<UniqueKey<MaTitleRecord>>asList(Keys.MA_TITLE_PKEY);
    }

    @Override
    public MaTitle as(String alias) {
        return new MaTitle(DSL.name(alias), this);
    }

    @Override
    public MaTitle as(Name alias) {
        return new MaTitle(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MaTitle rename(String name) {
        return new MaTitle(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MaTitle rename(Name name) {
        return new MaTitle(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
