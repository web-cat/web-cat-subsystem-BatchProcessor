/*==========================================================================*\
 |  _BatchFeedbackSection.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to BatchFeedbackSection.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2010 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package org.webcat.batchprocessor;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import er.extensions.eof.ERXEOControlUtilities;
import er.extensions.eof.ERXKey;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * BatchFeedbackSection.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _BatchFeedbackSection
    extends er.extensions.eof.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _BatchFeedbackSection object.
     */
    public _BatchFeedbackSection()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * BatchFeedbackSection object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @param isCollapsedValue
     * @param isLinkedValue
     * @return The newly created object
     */
    public static BatchFeedbackSection create(
        EOEditingContext editingContext,
        boolean isCollapsedValue,
        boolean isLinkedValue
        )
    {
        BatchFeedbackSection eoObject = (BatchFeedbackSection)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _BatchFeedbackSection.ENTITY_NAME);
        eoObject.setIsCollapsed(isCollapsedValue);
        eoObject.setIsLinked(isLinkedValue);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static BatchFeedbackSection localInstance(
        EOEditingContext editingContext, BatchFeedbackSection eo)
    {
        return (eo == null)
            ? null
            : (BatchFeedbackSection)EOUtilities.localInstanceOfObject(
                editingContext, eo);
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static BatchFeedbackSection forId(
        EOEditingContext ec, int id )
    {
        BatchFeedbackSection obj = null;
        if (id > 0)
        {
            NSArray<BatchFeedbackSection> results =
                objectsMatchingValues(ec, "id", new Integer(id));
            if (results != null && results.count() > 0)
            {
                obj = results.objectAtIndex(0);
            }
        }
        return obj;
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static BatchFeedbackSection forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.foundation.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String FILE_NAME_KEY = "fileName";
    public static final ERXKey<String> fileName =
        new ERXKey<String>(FILE_NAME_KEY);
    public static final String IS_COLLAPSED_KEY = "isCollapsed";
    public static final ERXKey<Integer> isCollapsed =
        new ERXKey<Integer>(IS_COLLAPSED_KEY);
    public static final String IS_LINKED_KEY = "isLinked";
    public static final ERXKey<Integer> isLinked =
        new ERXKey<Integer>(IS_LINKED_KEY);
    public static final String LOCATION_KEY = "location";
    public static final ERXKey<String> location =
        new ERXKey<String>(LOCATION_KEY);
    public static final String MIME_TYPE_KEY = "mimeType";
    public static final ERXKey<String> mimeType =
        new ERXKey<String>(MIME_TYPE_KEY);
    public static final String ORDER_KEY = "order";
    public static final ERXKey<Integer> order =
        new ERXKey<Integer>(ORDER_KEY);
    public static final String RECIPIENTS_KEY = "recipients";
    public static final ERXKey<String> recipients =
        new ERXKey<String>(RECIPIENTS_KEY);
    public static final String TITLE_KEY = "title";
    public static final ERXKey<String> title =
        new ERXKey<String>(TITLE_KEY);
    // To-one relationships ---
    public static final String BATCH_RESULT_KEY = "batchResult";
    public static final ERXKey<org.webcat.batchprocessor.BatchResult> batchResult =
        new ERXKey<org.webcat.batchprocessor.BatchResult>(BATCH_RESULT_KEY);
    // To-many relationships ---
    // Fetch specifications ---
    public static final String ENTITY_NAME = "BatchFeedbackSection";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public BatchFeedbackSection localInstance(EOEditingContext editingContext)
    {
        return (BatchFeedbackSection)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    @SuppressWarnings("unchecked")
    public NSDictionary<String, Object> changedProperties()
    {
        return changesFromSnapshot(
            editingContext().committedSnapshotForObject(this) );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>id</code> value.
     * @return the value of the attribute
     */
    public Number id()
    {
        try
        {
            return (Number)EOUtilities.primaryKeyForObject(
                editingContext() , this ).objectForKey( "id" );
        }
        catch (Exception e)
        {
            return er.extensions.eof.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>fileName</code> value.
     * @return the value of the attribute
     */
    public String fileName()
    {
        return (String)storedValueForKey( "fileName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>fileName</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setFileName( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setFileName("
                + value + "): was " + fileName() );
        }
        takeStoredValueForKey( value, "fileName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isCollapsed</code> value.
     * @return the value of the attribute
     */
    public boolean isCollapsed()
    {
        Integer result =
            (Integer)storedValueForKey( "isCollapsed" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isCollapsed</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsCollapsed( boolean value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsCollapsed("
                + value + "): was " + isCollapsed() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value ? 1 : 0 );
            setIsCollapsedRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isCollapsed</code> value.
     * @return the value of the attribute
     */
    public Integer isCollapsedRaw()
    {
        return (Integer)storedValueForKey( "isCollapsed" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isCollapsed</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsCollapsedRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsCollapsedRaw("
                + value + "): was " + isCollapsedRaw() );
        }
        takeStoredValueForKey( value, "isCollapsed" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isLinked</code> value.
     * @return the value of the attribute
     */
    public boolean isLinked()
    {
        Integer result =
            (Integer)storedValueForKey( "isLinked" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isLinked</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsLinked( boolean value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsLinked("
                + value + "): was " + isLinked() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value ? 1 : 0 );
            setIsLinkedRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isLinked</code> value.
     * @return the value of the attribute
     */
    public Integer isLinkedRaw()
    {
        return (Integer)storedValueForKey( "isLinked" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isLinked</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsLinkedRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setIsLinkedRaw("
                + value + "): was " + isLinkedRaw() );
        }
        takeStoredValueForKey( value, "isLinked" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>location</code> value.
     * @return the value of the attribute
     */
    public org.webcat.batchprocessor.BatchFeedbackLocation location()
    {
        String result =
            (String)storedValueForKey( "location" );
        return ( result == null )
            ? org.webcat.batchprocessor.BatchFeedbackLocation.DEFAULT
            : org.webcat.batchprocessor.BatchFeedbackLocation.valueOf(result);
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>location</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setLocation( org.webcat.batchprocessor.BatchFeedbackLocation value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setLocation("
                + "org.webcat.batchprocessor.BatchFeedbackLocation." + value
                + "): was org.webcat.batchprocessor.BatchFeedbackLocation."
                + location().name() );
        }
        setLocationRaw( value.name() );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>location</code> value.
     * @return the value of the attribute
     */
    public String locationRaw()
    {
        return (String)storedValueForKey( "location" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>location</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setLocationRaw( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setLocationRaw("
                + value + "): was " + locationRaw() );
        }
        takeStoredValueForKey( value, "location" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>mimeType</code> value.
     * @return the value of the attribute
     */
    public String mimeType()
    {
        return (String)storedValueForKey( "mimeType" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>mimeType</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMimeType( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMimeType("
                + value + "): was " + mimeType() );
        }
        takeStoredValueForKey( value, "mimeType" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>order</code> value.
     * @return the value of the attribute
     */
    public int order()
    {
        Integer result =
            (Integer)storedValueForKey( "order" );
        return ( result == null )
            ? 0
            : result.intValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>order</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setOrder( int value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setOrder("
                + value + "): was " + order() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value );
            setOrderRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>order</code> value.
     * @return the value of the attribute
     */
    public Integer orderRaw()
    {
        return (Integer)storedValueForKey( "order" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>order</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setOrderRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setOrderRaw("
                + value + "): was " + orderRaw() );
        }
        takeStoredValueForKey( value, "order" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>recipients</code> value.
     * @return the value of the attribute
     */
    public org.webcat.batchprocessor.BatchFeedbackRecipient recipients()
    {
        String result =
            (String)storedValueForKey( "recipients" );
        return ( result == null )
            ? org.webcat.batchprocessor.BatchFeedbackRecipient.OWNER
            : org.webcat.batchprocessor.BatchFeedbackRecipient.valueOf(result);
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>recipients</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setRecipients( org.webcat.batchprocessor.BatchFeedbackRecipient value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setRecipients("
                + "org.webcat.batchprocessor.BatchFeedbackRecipient." + value
                + "): was org.webcat.batchprocessor.BatchFeedbackRecipient."
                + recipients().name() );
        }
        setRecipientsRaw( value.name() );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>recipients</code> value.
     * @return the value of the attribute
     */
    public String recipientsRaw()
    {
        return (String)storedValueForKey( "recipients" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>recipients</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setRecipientsRaw( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setRecipientsRaw("
                + value + "): was " + recipientsRaw() );
        }
        takeStoredValueForKey( value, "recipients" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>title</code> value.
     * @return the value of the attribute
     */
    public String title()
    {
        return (String)storedValueForKey( "title" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>title</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTitle( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setTitle("
                + value + "): was " + title() );
        }
        takeStoredValueForKey( value, "title" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>batchResult</code>
     * relationship.
     * @return the entity in the relationship
     */
    public org.webcat.batchprocessor.BatchResult batchResult()
    {
        return (org.webcat.batchprocessor.BatchResult)storedValueForKey( "batchResult" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>batchResult</code>
     * relationship (DO NOT USE--instead, use
     * <code>setBatchResultRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setBatchResult( org.webcat.batchprocessor.BatchResult value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setBatchResult("
                + value + "): was " + batchResult() );
        }
        takeStoredValueForKey( value, "batchResult" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>batchResult</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setBatchResultRelationship(
        org.webcat.batchprocessor.BatchResult value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setBatchResultRelationship("
                + value + "): was " + batchResult() );
        }
        if ( value == null )
        {
            org.webcat.batchprocessor.BatchResult object = batchResult();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "batchResult" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "batchResult" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a fetch specification.
     *
     * @param context The editing context to use
     * @param fspec The fetch specification to use
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<BatchFeedbackSection> objectsWithFetchSpecification(
        EOEditingContext context,
        EOFetchSpecification fspec)
    {
        return context.objectsWithFetchSpecification(fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve all objects of this type.
     *
     * @param context The editing context to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<BatchFeedbackSection> allObjects(
        EOEditingContext context)
    {
        return objectsMatchingQualifier(context, null, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<BatchFeedbackSection> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier)
    {
        return objectsMatchingQualifier(context, qualifier, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier and sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings The sort orderings to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<BatchFeedbackSection> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        EOFetchSpecification fspec = new EOFetchSpecification(
            ENTITY_NAME, qualifier, sortOrderings);
        fspec.setUsesDistinct(true);
        return objectsWithFetchSpecification(context, fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the first object that matches a qualifier, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings the sort orderings
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static BatchFeedbackSection firstObjectMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        NSArray<BatchFeedbackSection> results =
            objectsMatchingQualifier(context, qualifier, sortOrderings);
        return (results.size() > 0)
            ? results.get(0)
            : null;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return the single entity that was retrieved
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static BatchFeedbackSection uniqueObjectMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier) throws EOUtilities.MoreThanOneException
    {
        NSArray<BatchFeedbackSection> results =
            objectsMatchingQualifier(context, qualifier);
        if (results.size() > 1)
        {
            throw new EOUtilities.MoreThanOneException(null);
        }
        return (results.size() > 0)
            ? results.get(0)
            : null;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<BatchFeedbackSection> objectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return objectsMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<BatchFeedbackSection> objectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return EOUtilities.objectsMatchingValues(context, ENTITY_NAME,
            keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the first object that matches a set of keys and values, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param sortOrderings the sort orderings
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static BatchFeedbackSection firstObjectMatchingValues(
        EOEditingContext context,
        NSArray<EOSortOrdering> sortOrderings,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return firstObjectMatchingValues(
            context, sortOrderings, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieves the first object that matches a set of keys and values, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param sortOrderings the sort orderings
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static BatchFeedbackSection firstObjectMatchingValues(
        EOEditingContext context,
        NSArray<EOSortOrdering> sortOrderings,
        NSDictionary<String, Object> keysAndValues)
    {
        EOFetchSpecification fspec = new EOFetchSpecification(
            ENTITY_NAME,
            EOQualifier.qualifierToMatchAllValues(keysAndValues),
            sortOrderings);
        fspec.setFetchLimit(1);

        NSArray<BatchFeedbackSection> result =
            objectsWithFetchSpecification( context, fspec );

        if ( result.count() == 0 )
        {
            return null;
        }
        else
        {
            return result.objectAtIndex(0);
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the single entity that was retrieved, or null if there was none
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static BatchFeedbackSection uniqueObjectMatchingValues(
        EOEditingContext context,
        Object... keysAndValues) throws EOUtilities.MoreThanOneException
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return uniqueObjectMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve an object using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the single entity that was retrieved, or null if there was none
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static BatchFeedbackSection uniqueObjectMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
        throws EOUtilities.MoreThanOneException
    {
        try
        {
            return (BatchFeedbackSection)EOUtilities.objectMatchingValues(
                context, ENTITY_NAME, keysAndValues);
        }
        catch (EOObjectNotAvailableException e)
        {
            return null;
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of all objects of this type.
     *
     * @param context The editing context to use
     *
     * @return the count of all objects
     */
    public static int countOfAllObjects(EOEditingContext context)
    {
        return countOfObjectsMatchingQualifier(context, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of objects that match a qualifier.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return the count of objects matching the qualifier
     */
    public static int countOfObjectsMatchingQualifier(
        EOEditingContext context, EOQualifier qualifier)
    {
        return ERXEOControlUtilities.objectCountWithQualifier(
                context, ENTITY_NAME, qualifier);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of objects using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the count of objects that match the specified values
     */
    public static int countOfObjectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return countOfObjectsMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of objects using a dictionary of keys and values to
     * match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the count of objects that matched the specified values
     */
    public static int countOfObjectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return countOfObjectsMatchingQualifier(context,
                EOQualifier.qualifierToMatchAllValues(keysAndValues));
    }


    // ----------------------------------------------------------
    /**
     * Produce a string representation of this object.  This implementation
     * calls UserPresentableDescription(), which uses WebObjects' internal
     * mechanism to print out the visible fields of this object.  Normally,
     * subclasses would override userPresentableDescription() to change
     * the way the object is printed.
     *
     * @return A string representation of the object's value
     */
    public String toString()
    {
        return userPresentableDescription();
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( BatchFeedbackSection.class );
}
