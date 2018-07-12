/*
 * This file is generated by jOOQ.
 */
package com.yg.gqlwfdl.yg.db.public_.tables.records;


import com.yg.gqlwfdl.yg.db.public_.tables.Customer;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record5<Long, String, String, Long, Long> {

    private static final long serialVersionUID = 210989759;

    /**
     * Setter for <code>PUBLIC.CUSTOMER.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CUSTOMER.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CUSTOMER.FIRST_NAME</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CUSTOMER.FIRST_NAME</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CUSTOMER.LAST_NAME</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CUSTOMER.LAST_NAME</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CUSTOMER.COMPANY_ID</code>.
     */
    public void setCompanyId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CUSTOMER.COMPANY_ID</code>.
     */
    public Long getCompanyId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>PUBLIC.CUSTOMER.OUT_OF_OFFICE_DELEGATE</code>.
     */
    public void setOutOfOfficeDelegate(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.CUSTOMER.OUT_OF_OFFICE_DELEGATE</code>.
     */
    public Long getOutOfOfficeDelegate() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Customer.CUSTOMER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Customer.CUSTOMER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Customer.CUSTOMER.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Customer.CUSTOMER.OUT_OF_OFFICE_DELEGATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getOutOfOfficeDelegate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getOutOfOfficeDelegate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value4(Long value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord value5(Long value) {
        setOutOfOfficeDelegate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerRecord values(Long value1, String value2, String value3, Long value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Long id, String firstName, String lastName, Long companyId, Long outOfOfficeDelegate) {
        super(Customer.CUSTOMER);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, companyId);
        set(4, outOfOfficeDelegate);
    }
}