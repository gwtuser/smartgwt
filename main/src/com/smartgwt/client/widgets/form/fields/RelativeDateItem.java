/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
/* sgwtgen */
 
package com.smartgwt.client.widgets.form.fields;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A FormItem for entering a date relative to today or relative to some other date, or a specific date.  Typically used for
 * filtering data by date. <P> The RelativeDateItem consists of a {@link
 * com.smartgwt.client.widgets.form.fields.ComboBoxItem} where the user may directly choose  one of several {@link
 * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions preset options}, choose to enter a  {@link
 * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getQuantityField quantity} and {@link
 * com.smartgwt.client.types.TimeUnit time unit}  (eg "4 months ago" or "3 years from now") or directly type in  an
 * absolute date value (7/18/2009).
 */
@BeanFactory.FrameworkClass
public class RelativeDateItem extends CanvasItem {

    public static RelativeDateItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);

		if(obj != null && JSOHelper.getAttribute(jsObj,"__ref")==null) {
            return com.smartgwt.client.util.ObjectFactory.createFormItem("RelativeDateItem",jsObj);

        } else
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (RelativeDateItem) obj;
        } else {
            return new RelativeDateItem(jsObj);
        }
    }


    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc.RelativeDateItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc.RelativeDateItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public static native void changePickerIconDefaults(FormItemIcon defaults) /*-{
        $wnd.isc.RelativeDateItem.changeDefaults("pickerIconDefaults", defaults.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public RelativeDateItem(){
        setAttribute("editorType", "RelativeDateItem");
    }

    public RelativeDateItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public RelativeDateItem(String name) {
        setName(name);
                setAttribute("editorType", "RelativeDateItem");
    }


    public RelativeDateItem(String name, String title) {
        setName(name);
		setTitle(title);
                setAttribute("editorType", "RelativeDateItem");
    }


    // ********************* Properties / Attributes ***********************

    /**
     * Base date for calculating the relative date entered by the user. <P> The default is to use the current date.
     *
     * @param baseDate  Default value is null
     */
    public void setBaseDate(Date baseDate) {
        setAttribute("baseDate", baseDate);
    }

    /**
     * Base date for calculating the relative date entered by the user. <P> The default is to use the current date.
     *
     * @return Date
     */
    public Date getBaseDate()  {
        return getAttributeAsDate("baseDate");
    }

    /**
     * Field that shows the current calculated date by adding the user-entered relative date to the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getBaseDate baseDate}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return BlurbItem
     */
    public BlurbItem getCalculatedDateField()  {
        return BlurbItem.getOrCreateRef(getAttributeAsJavaScriptObject("calculatedDateField"));
    }

    /**
     * Only used if we're showing the date in a text field. When parsing a date, if the year is specified with 1 or 2 digits
     * and is less than the centuryThreshold, then the year will be assumed to be 20xx; otherwise it will be interpreted
     * according to default browser behaviour, which will consider it to be 19xx. <P> If you need to allow 1 and 2 digit years,
     * set this attribute to  <code>null</code> to have the control retain your year-value as entered.
     *
     * @param centuryThreshold  Default value is 25
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setCenturyThreshold(int centuryThreshold) {
        setAttribute("centuryThreshold", centuryThreshold);
    }

    /**
     * Only used if we're showing the date in a text field. When parsing a date, if the year is specified with 1 or 2 digits
     * and is less than the centuryThreshold, then the year will be assumed to be 20xx; otherwise it will be interpreted
     * according to default browser behaviour, which will consider it to be 19xx. <P> If you need to allow 1 and 2 digit years,
     * set this attribute to  <code>null</code> to have the control retain your year-value as entered.
     *
     * @return int
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getCenturyThreshold()  {
        return getAttributeAsInt("centuryThreshold");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "day".
     *
     * @param daysAgoTitle  Default value is "N days ago"
     */
    public void setDaysAgoTitle(String daysAgoTitle) {
        setAttribute("daysAgoTitle", daysAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "day".
     *
     * @return String
     */
    public String getDaysAgoTitle()  {
        return getAttributeAsString("daysAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "day".
     *
     * @param daysFromNowTitle  Default value is "N days from now"
     */
    public void setDaysFromNowTitle(String daysFromNowTitle) {
        setAttribute("daysFromNowTitle", daysFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "day".
     *
     * @return String
     */
    public String getDaysFromNowTitle()  {
        return getAttributeAsString("daysFromNowTitle");
    }

    /**
     * Default quantity to show in the {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getQuantityField
     * quantityField}.
     *
     * @param defaultQuantity  Default value is 1
     */
    public void setDefaultQuantity(int defaultQuantity) {
        setAttribute("defaultQuantity", defaultQuantity);
    }

    /**
     * Default quantity to show in the {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getQuantityField
     * quantityField}.
     *
     * @return int
     */
    public int getDefaultQuantity()  {
        return getAttributeAsInt("defaultQuantity");
    }

    /**
     * Maximum date the selectors will allow the user to pick. <P> See {@link
     * com.smartgwt.client.widgets.form.fields.DateItem#getStartDate startDate} for details on how this restriction works.
     *
     * @param endDate  Default value is 12/31/2015
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setEndDate(Date endDate) {
        setAttribute("endDate", endDate);
    }

    /**
     * Maximum date the selectors will allow the user to pick. <P> See {@link
     * com.smartgwt.client.widgets.form.fields.DateItem#getStartDate startDate} for details on how this restriction works.
     *
     * @return Date
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Date getEndDate()  {
        return getAttributeAsDate("endDate");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "hour".
     *
     * @param hoursAgoTitle  Default value is "N hours ago"
     */
    public void setHoursAgoTitle(String hoursAgoTitle) {
        setAttribute("hoursAgoTitle", hoursAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "hour".
     *
     * @return String
     */
    public String getHoursAgoTitle()  {
        return getAttributeAsString("hoursAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "hour".
     *
     * @param hoursFromNowTitle  Default value is "N hours from now"
     */
    public void setHoursFromNowTitle(String hoursFromNowTitle) {
        setAttribute("hoursFromNowTitle", hoursFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "hour".
     *
     * @return String
     */
    public String getHoursFromNowTitle()  {
        return getAttributeAsString("hoursFromNowTitle");
    }

    /**
     * Format for direct user input of date values. <P> If unset, the input format will be determined based on the specified
     * {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDisplayFormat displayFormat} if possible, otherwise
     * picked up from the Date class (see {@link com.smartgwt.client.util.Date#setInputFormat Date.setInputFormat}).
     *
     * @param inputFormat  See {@link com.smartgwt.client.docs.DateInputFormat DateInputFormat} . Default value is null
     */
    public void setInputFormat(String inputFormat) {
        setAttribute("inputFormat", inputFormat);
    }

    /**
     * Format for direct user input of date values. <P> If unset, the input format will be determined based on the specified
     * {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDisplayFormat displayFormat} if possible, otherwise
     * picked up from the Date class (see {@link com.smartgwt.client.util.Date#setInputFormat Date.setInputFormat}).
     *
     * @return If {@link com.smartgwt.client.widgets.form.fields.DateItem#getUseTextField useTextField} is <code>true</code> this
     * method returns a standard {@link com.smartgwt.client.docs.DateInputFormat}, determining how values entered by the user
     * are to be converted to Javascript Date objects. <P> If an explicit {@link
     * com.smartgwt.client.widgets.form.fields.DateItem#getInputFormat inputFormat} has been specified it will be returned,
     * otherwise, the input format will be automatically derived from the {@link
     * com.smartgwt.client.widgets.form.fields.DateItem#getDateFormatter dateFormatter} property. <P> Note that the inputFormat
     * will ignore any separator characters and padding of values. However if necessary entirely custom date formatting and
     * parsing may be achieved via the  <code>setEditorValueFormatter()</code> and  <code>setEditorValueParser()</code> APIs. See {@link com.smartgwt.client.docs.DateInputFormat DateInputFormat} 
     */
    public String getInputFormat()  {
        return getAttributeAsString("inputFormat");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "millisecond".
     *
     * @param millisecondsAgoTitle  Default value is "N milliseconds ago"
     */
    public void setMillisecondsAgoTitle(String millisecondsAgoTitle) {
        setAttribute("millisecondsAgoTitle", millisecondsAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "millisecond".
     *
     * @return String
     */
    public String getMillisecondsAgoTitle()  {
        return getAttributeAsString("millisecondsAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "millisecond".
     *
     * @param millisecondsFromNowTitle  Default value is "N milliseconds from now"
     */
    public void setMillisecondsFromNowTitle(String millisecondsFromNowTitle) {
        setAttribute("millisecondsFromNowTitle", millisecondsFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "millisecond".
     *
     * @return String
     */
    public String getMillisecondsFromNowTitle()  {
        return getAttributeAsString("millisecondsFromNowTitle");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "minute".
     *
     * @param minutesAgoTitle  Default value is "N minutes ago"
     */
    public void setMinutesAgoTitle(String minutesAgoTitle) {
        setAttribute("minutesAgoTitle", minutesAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "minute".
     *
     * @return String
     */
    public String getMinutesAgoTitle()  {
        return getAttributeAsString("minutesAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "minute".
     *
     * @param minutesFromNowTitle  Default value is "N minutes from now"
     */
    public void setMinutesFromNowTitle(String minutesFromNowTitle) {
        setAttribute("minutesFromNowTitle", minutesFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "minute".
     *
     * @return String
     */
    public String getMinutesFromNowTitle()  {
        return getAttributeAsString("minutesFromNowTitle");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "month".
     *
     * @param monthsAgoTitle  Default value is "N months ago"
     */
    public void setMonthsAgoTitle(String monthsAgoTitle) {
        setAttribute("monthsAgoTitle", monthsAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "month".
     *
     * @return String
     */
    public String getMonthsAgoTitle()  {
        return getAttributeAsString("monthsAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "month".
     *
     * @param monthsFromNowTitle  Default value is "N months from now"
     */
    public void setMonthsFromNowTitle(String monthsFromNowTitle) {
        setAttribute("monthsFromNowTitle", monthsFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "month".
     *
     * @return String
     */
    public String getMonthsFromNowTitle()  {
        return getAttributeAsString("monthsFromNowTitle");
    }

    /**
     * What operator to use when  the <code>FormItemCriterionGetter</code>'s <code>getCriterion()</code> method is called.
     *
     * @param operator  Default value is "greaterThan"
     */
    public void setOperator(OperatorId operator) {
        setAttribute("operator", operator == null ? null : operator.getValue());
    }

    /**
     * What operator to use when  the <code>FormItemCriterionGetter</code>'s <code>getCriterion()</code> method is called.
     *
     * @return OperatorId
     */
    public OperatorId getOperator()  {
        return EnumUtil.getEnum(OperatorId.values(), getAttribute("operator"));
    }

    /**
     * Smart GWT class for the {@link com.smartgwt.client.widgets.DateChooser dateChooser} autoChild displayed to allow the
     * user to directly select dates.
     *
     * @param pickerConstructor  Default value is "DateChooser"
     */
    public void setPickerConstructor(String pickerConstructor) {
        setAttribute("pickerConstructor", pickerConstructor);
    }

    /**
     * Smart GWT class for the {@link com.smartgwt.client.widgets.DateChooser dateChooser} autoChild displayed to allow the
     * user to directly select dates.
     *
     * @return String
     */
    public String getPickerConstructor()  {
        return getAttributeAsString("pickerConstructor");
    }

    /**
     * Icon that launches a {@link com.smartgwt.client.widgets.DateChooser} for choosing an absolute date.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return FormItemIcon
     */
    public FormItemIcon getPickerIcon()  {
        return new FormItemIcon(getAttributeAsJavaScriptObject("pickerIcon"));
    }

    /**
     * Prompt to show when the user hovers the mouse over the picker icon for this  RelativeDateItem. May be overridden for
     * localization of your application.
     *
     * @param pickerIconPrompt  Default value is "Show Date Chooser"
     */
    public void setPickerIconPrompt(String pickerIconPrompt) {
        setAttribute("pickerIconPrompt", pickerIconPrompt);
    }

    /**
     * Prompt to show when the user hovers the mouse over the picker icon for this  RelativeDateItem. May be overridden for
     * localization of your application.
     *
     * @return String
     */
    public String getPickerIconPrompt()  {
        return getAttributeAsString("pickerIconPrompt");
    }

    /**
     * A set of properties to apply to the {@link com.smartgwt.client.widgets.form.fields.TimeItem} displayed in the picker
     * when {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowPickerTimeItem showPickerTimeItem} is true.
     * <P> Has no effect for fields of type <code>"date"</code>.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param pickerTimeItemProperties  Default value is null
     */
    public void setPickerTimeItemProperties(TimeItem pickerTimeItemProperties) {
        setAttribute("pickerTimeItemProperties", pickerTimeItemProperties.getJsObj());
    }

    /**
     * A set of properties to apply to the {@link com.smartgwt.client.widgets.form.fields.TimeItem} displayed in the picker
     * when {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowPickerTimeItem showPickerTimeItem} is true.
     * <P> Has no effect for fields of type <code>"date"</code>.
     *
     * @return TimeItem
     */
    public TimeItem getPickerTimeItemProperties()  {
        return TimeItem.getOrCreateRef(getAttributeAsJavaScriptObject("pickerTimeItemProperties"));
    }

    /**
     * Field allowing user to pick units of time, eg, number of days.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return SpinnerItem
     */
    public SpinnerItem getQuantityField()  {
        return SpinnerItem.getOrCreateRef(getAttributeAsJavaScriptObject("quantityField"));
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "quarter".
     *
     * @param quartersAgoTitle  Default value is "N quarters ago"
     */
    public void setQuartersAgoTitle(String quartersAgoTitle) {
        setAttribute("quartersAgoTitle", quartersAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "quarter".
     *
     * @return String
     */
    public String getQuartersAgoTitle()  {
        return getAttributeAsString("quartersAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "quarter".
     *
     * @param quartersFromNowTitle  Default value is "N quarters from now"
     */
    public void setQuartersFromNowTitle(String quartersFromNowTitle) {
        setAttribute("quartersFromNowTitle", quartersFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "quarter".
     *
     * @return String
     */
    public String getQuartersFromNowTitle()  {
        return getAttributeAsString("quartersFromNowTitle");
    }

    /**
     * Does this items relative date value refer to the start or end of the chosen date? Useful when using this item to
     * generate filter criteria, such as the from or to value for an inclusive range. <P> If unset "start" is assumed.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param rangePosition  Default value is null
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#setOperator
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#setRangeRoundingGranularity
     */
    public void setRangePosition(RelativeDateRangePosition rangePosition) {
        setAttribute("rangePosition", rangePosition == null ? null : rangePosition.getValue());
    }

    /**
     * Does this items relative date value refer to the start or end of the chosen date? Useful when using this item to
     * generate filter criteria, such as the from or to value for an inclusive range. <P> If unset "start" is assumed.
     *
     * @return RelativeDateRangePosition
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#getOperator
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#getRangeRoundingGranularity
     */
    public RelativeDateRangePosition getRangePosition()  {
        return EnumUtil.getEnum(RelativeDateRangePosition.values(), getAttribute("rangePosition"));
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "second".
     *
     * @param secondsAgoTitle  Default value is "N seconds ago"
     */
    public void setSecondsAgoTitle(String secondsAgoTitle) {
        setAttribute("secondsAgoTitle", secondsAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "second".
     *
     * @return String
     */
    public String getSecondsAgoTitle()  {
        return getAttributeAsString("secondsAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "second".
     *
     * @param secondsFromNowTitle  Default value is "N seconds from now"
     */
    public void setSecondsFromNowTitle(String secondsFromNowTitle) {
        setAttribute("secondsFromNowTitle", secondsFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "second".
     *
     * @return String
     */
    public String getSecondsFromNowTitle()  {
        return getAttributeAsString("secondsFromNowTitle");
    }

    /**
     * Should the Calculated-Date be displayed to the right of the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPickerIcon pickerIcon}.
     *
     * @param showCalculatedDateField  Default value is true
     */
    public void setShowCalculatedDateField(Boolean showCalculatedDateField) {
        setAttribute("showCalculatedDateField", showCalculatedDateField);
    }

    /**
     * Should the Calculated-Date be displayed to the right of the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPickerIcon pickerIcon}.
     *
     * @return Boolean
     */
    public Boolean getShowCalculatedDateField()  {
        return getAttributeAsBoolean("showCalculatedDateField");
    }

    /**
     * When set to true, show a button that allows the calendar to be navigated by fiscal year.
     *
     * @param showChooserFiscalYearPicker  Default value is false
     */
    public void setShowChooserFiscalYearPicker(Boolean showChooserFiscalYearPicker) {
        setAttribute("showChooserFiscalYearPicker", showChooserFiscalYearPicker);
    }

    /**
     * When set to true, show a button that allows the calendar to be navigated by fiscal year.
     *
     * @return Boolean
     */
    public Boolean getShowChooserFiscalYearPicker()  {
        return getAttributeAsBoolean("showChooserFiscalYearPicker");
    }

    /**
     * Should we show the icon that displays a date-chooser?
     *
     * @param showChooserIcon  Default value is true
     */
    public void setShowChooserIcon(Boolean showChooserIcon) {
        setAttribute("showChooserIcon", showChooserIcon);
    }

    /**
     * Should we show the icon that displays a date-chooser?
     *
     * @return Boolean
     */
    public Boolean getShowChooserIcon()  {
        return getAttributeAsBoolean("showChooserIcon");
    }

    /**
     * When set to true, show a button that allows the calendar to be navigated by week or fiscal week, depending on the value
     * of {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowChooserFiscalYearPicker
     * showChooserFiscalYearPicker}.
     *
     * @param showChooserWeekPicker  Default value is false
     */
    public void setShowChooserWeekPicker(Boolean showChooserWeekPicker) {
        setAttribute("showChooserWeekPicker", showChooserWeekPicker);
    }

    /**
     * When set to true, show a button that allows the calendar to be navigated by week or fiscal week, depending on the value
     * of {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowChooserFiscalYearPicker
     * showChooserFiscalYearPicker}.
     *
     * @return Boolean
     */
    public Boolean getShowChooserWeekPicker()  {
        return getAttributeAsBoolean("showChooserWeekPicker");
    }

    /**
     * Should we show time-unit options in the future? If set to false, for each  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getTimeUnitOptions timeUnitOption} we will show only past
     * options [for example "N weeks ago"]. <P> Note: this does not change the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presetOptions}, which show up in  addition to
     * the time-unit options (<i>"N days from now"</i>, etc). The default preset options include both past and future presets
     * so developers may wish to modify the presets to ensure only future options are available.
     *
     * @param showFutureOptions  Default value is true
     */
    public void setShowFutureOptions(Boolean showFutureOptions) {
        setAttribute("showFutureOptions", showFutureOptions);
    }

    /**
     * Should we show time-unit options in the future? If set to false, for each  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getTimeUnitOptions timeUnitOption} we will show only past
     * options [for example "N weeks ago"]. <P> Note: this does not change the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presetOptions}, which show up in  addition to
     * the time-unit options (<i>"N days from now"</i>, etc). The default preset options include both past and future presets
     * so developers may wish to modify the presets to ensure only future options are available.
     *
     * @return Boolean
     */
    public Boolean getShowFutureOptions()  {
        return getAttributeAsBoolean("showFutureOptions");
    }

    /**
     * Should we show time-unit options in the past? If set to false, for each  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getTimeUnitOptions timeUnitOption} we will show only future
     * options [for example "N weeks from now"]. <P> Note: this does not change the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presetOptions}, which show up in  addition to
     * the time-unit options (<i>"N days from now"</i>, etc). The default preset options include both past and future presets
     * so developers may wish to modify the presets to ensure only past options are available.
     *
     * @param showPastOptions  Default value is true
     */
    public void setShowPastOptions(Boolean showPastOptions) {
        setAttribute("showPastOptions", showPastOptions);
    }

    /**
     * Should we show time-unit options in the past? If set to false, for each  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getTimeUnitOptions timeUnitOption} we will show only future
     * options [for example "N weeks from now"]. <P> Note: this does not change the {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presetOptions}, which show up in  addition to
     * the time-unit options (<i>"N days from now"</i>, etc). The default preset options include both past and future presets
     * so developers may wish to modify the presets to ensure only past options are available.
     *
     * @return Boolean
     */
    public Boolean getShowPastOptions()  {
        return getAttributeAsBoolean("showPastOptions");
    }

    /**
     * If this item is editing a field of type <code>"datetime"</code>, should the {@link
     * com.smartgwt.client.widgets.DateChooser} display the {@link com.smartgwt.client.widgets.DateChooser#getShowTimeItem time
     * field},  allowing the user to select a time? <P> One case where developers will wish to suppress this time-field from
     * being displayed is if a custom {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDateFormatter
     * dateFormatter} has been specified which does not display the time portion of the selected date. In this case any value
     * selected from the  DateChooser's time field will be discarded when the picker is dismissed, making it a confusing UI for
     * the end user. <P> Has no effect if the field type is <code>"date"</code> - in this case the picker will never show the
     * time field.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showPickerTimeItem  Default value is true
     */
    public void setShowPickerTimeItem(Boolean showPickerTimeItem) {
        setAttribute("showPickerTimeItem", showPickerTimeItem);
    }

    /**
     * If this item is editing a field of type <code>"datetime"</code>, should the {@link
     * com.smartgwt.client.widgets.DateChooser} display the {@link com.smartgwt.client.widgets.DateChooser#getShowTimeItem time
     * field},  allowing the user to select a time? <P> One case where developers will wish to suppress this time-field from
     * being displayed is if a custom {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDateFormatter
     * dateFormatter} has been specified which does not display the time portion of the selected date. In this case any value
     * selected from the  DateChooser's time field will be discarded when the picker is dismissed, making it a confusing UI for
     * the end user. <P> Has no effect if the field type is <code>"date"</code> - in this case the picker will never show the
     * time field.
     *
     * @return Boolean
     */
    public Boolean getShowPickerTimeItem()  {
        return getAttributeAsBoolean("showPickerTimeItem");
    }

    /**
     * Minimum date the selectors will allow the user to pick. <P> <b>NOTE:</b> by design, setting <code>startDate</code> and
     * <code>endDate</code> will not always prevent the user from picking invalid values.  In particular: <ul> <li> the set of
     * available days will only be restricted if the start and end dates fall within the same month <li> the set of available
     * months will only be restricted if the start and end dates fall within the same year </ul> <P> This is <b>by design</b>
     * as it allows the user to set the day, month and year in whatever order is convenient, rather than forcing them to pick
     * in a specific order. <P> For actual enforcement of a date being in correct range before data is submitted, a {@link
     * com.smartgwt.client.widgets.form.validator.Validator} of type "dateRange" should always be declared.
     *
     * @param startDate  Default value is 1/1/1995
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setStartDate(Date startDate) {
        setAttribute("startDate", startDate);
    }

    /**
     * Minimum date the selectors will allow the user to pick. <P> <b>NOTE:</b> by design, setting <code>startDate</code> and
     * <code>endDate</code> will not always prevent the user from picking invalid values.  In particular: <ul> <li> the set of
     * available days will only be restricted if the start and end dates fall within the same month <li> the set of available
     * months will only be restricted if the start and end dates fall within the same year </ul> <P> This is <b>by design</b>
     * as it allows the user to set the day, month and year in whatever order is convenient, rather than forcing them to pick
     * in a specific order. <P> For actual enforcement of a date being in correct range before data is submitted, a {@link
     * com.smartgwt.client.widgets.form.validator.Validator} of type "dateRange" should always be declared.
     *
     * @return Date
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Date getStartDate()  {
        return getAttributeAsDate("startDate");
    }

    /**
     * List of time units that will be offered for relative dates. <P> Each available time unit option will cause two options
     * to appear in the  {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getValueField valueField}.  For
     * example, if "day" is an available {@link com.smartgwt.client.types.TimeUnit time unit} option, there will be {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysAgoTitle "N days ago"} and  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysFromNowTitle "N days from now"}.
     *
     * @param timeUnitOptions  Default value is ["day", "week", "month"]
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#setShowPastOptions
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#setShowFutureOptions
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#setRangeRoundingGranularity
     */
    public void setTimeUnitOptions(TimeUnit... timeUnitOptions) {
        setAttribute("timeUnitOptions", timeUnitOptions);
    }

    /**
     * List of time units that will be offered for relative dates. <P> Each available time unit option will cause two options
     * to appear in the  {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getValueField valueField}.  For
     * example, if "day" is an available {@link com.smartgwt.client.types.TimeUnit time unit} option, there will be {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysAgoTitle "N days ago"} and  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysFromNowTitle "N days from now"}.
     *
     * @return TimeUnit...
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowPastOptions
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowFutureOptions
     * @see com.smartgwt.client.widgets.form.fields.RelativeDateItem#getRangeRoundingGranularity
     */
    public TimeUnit[] getTimeUnitOptions()  {
        final String[] strings = getAttributeAsStringArray("timeUnitOptions");
        return EnumUtil.getEnums(TimeUnit.values(), strings, strings == null ? null : new TimeUnit[strings.length]);
    }

    /**
     * When showing the {@link com.smartgwt.client.widgets.DateChooser}, should the  {@link
     * com.smartgwt.client.widgets.DateChooser#getShowTimeItem time field} be set to use 24-hour time? Has no effect for fields
     * of type <code>"date"</code> rather than  <code>"datetime"</code>, or if {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowPickerTimeItem showPickerTimeItem} is
     * <code>false</code>. <P> Default is true.
     *
     * @param use24HourTime  Default value is true
     */
    public void setUse24HourTime(Boolean use24HourTime) {
        setAttribute("use24HourTime", use24HourTime);
    }

    /**
     * When showing the {@link com.smartgwt.client.widgets.DateChooser}, should the  {@link
     * com.smartgwt.client.widgets.DateChooser#getShowTimeItem time field} be set to use 24-hour time? Has no effect for fields
     * of type <code>"date"</code> rather than  <code>"datetime"</code>, or if {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowPickerTimeItem showPickerTimeItem} is
     * <code>false</code>. <P> Default is true.
     *
     * @return Boolean
     */
    public Boolean getUse24HourTime()  {
        return getAttributeAsBoolean("use24HourTime");
    }

    /**
     * When set to true (the default), use a single shared date-picker across all widgets that use one.  When false, create a
     * new picker using the autoChild system.  See  {@link com.smartgwt.client.widgets.form.fields.DateItem#getPickerDefaults
     * picker} and  {@link com.smartgwt.client.widgets.form.fields.DateItem#getPickerProperties pickerProperties} for details
     * on setting up an unshared picker.
     *
     * @param useSharedPicker  Default value is true
     */
    public void setUseSharedPicker(Boolean useSharedPicker) {
        setAttribute("useSharedPicker", useSharedPicker);
    }

    /**
     * When set to true (the default), use a single shared date-picker across all widgets that use one.  When false, create a
     * new picker using the autoChild system.  See  {@link com.smartgwt.client.widgets.form.fields.DateItem#getPickerDefaults
     * picker} and  {@link com.smartgwt.client.widgets.form.fields.DateItem#getPickerProperties pickerProperties} for details
     * on setting up an unshared picker.
     *
     * @return Boolean
     */
    public Boolean getUseSharedPicker()  {
        return getAttributeAsBoolean("useSharedPicker");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "week".
     *
     * @param weeksAgoTitle  Default value is "N weeks ago"
     */
    public void setWeeksAgoTitle(String weeksAgoTitle) {
        setAttribute("weeksAgoTitle", weeksAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "week".
     *
     * @return String
     */
    public String getWeeksAgoTitle()  {
        return getAttributeAsString("weeksAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "week".
     *
     * @param weeksFromNowTitle  Default value is "N weeks from now"
     */
    public void setWeeksFromNowTitle(String weeksFromNowTitle) {
        setAttribute("weeksFromNowTitle", weeksFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "week".
     *
     * @return String
     */
    public String getWeeksFromNowTitle()  {
        return getAttributeAsString("weeksFromNowTitle");
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "year".
     *
     * @param yearsAgoTitle  Default value is "N years ago"
     */
    public void setYearsAgoTitle(String yearsAgoTitle) {
        setAttribute("yearsAgoTitle", yearsAgoTitle);
    }

    /**
     * The title to show for historical periods when the {@link com.smartgwt.client.types.TimeUnit} is "year".
     *
     * @return String
     */
    public String getYearsAgoTitle()  {
        return getAttributeAsString("yearsAgoTitle");
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "year".
     *
     * @param yearsFromNowTitle  Default value is "N years from now"
     */
    public void setYearsFromNowTitle(String yearsFromNowTitle) {
        setAttribute("yearsFromNowTitle", yearsFromNowTitle);
    }

    /**
     * The title to show for future periods when the {@link com.smartgwt.client.types.TimeUnit} is "year".
     *
     * @return String
     */
    public String getYearsFromNowTitle()  {
        return getAttributeAsString("yearsFromNowTitle");
    }

    // ********************* Methods ***********************
	/**
     * RelativeDateItems do not make use of the standard {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#formatEditorValue FormItem.formatEditorValue} and {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#parseEditorValue FormItem.parseEditorValue} methods. Developers can
     * customize the display values for these items in the following ways:<ul> <li>The {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presetOptions} map allows standard preset
     * RelativeDateString      and RelativeDateShortcut values to be mapped to custom display values</li> <li>The text
     * displayed for each of the {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getTimeUnitOptions
     * timeUnitOptions} (e.g:"N days ago") may be     customized via the per-time unit title attributes ({@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysFromNowTitle daysFromNowTitle},      {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysAgoTitle daysAgoTitle}, etc)</li> <li>The {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDateFormatter dateFormatter} and {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getInputFormat inputFormat} may be used modify how date values 
     * are displayed (both in the text entry box and in the    {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowCalculatedDateField calculatedDateField}</li> </ul>
     */
    public native void formatEditorValue() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.formatEditorValue();
    }-*/;

	/**
     * Returns the raw text value typed into this items value text field
     */
    public native void getEnteredValue() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.getEnteredValue();
    }-*/;

	/**
     * Returns the {@link com.smartgwt.client.widgets.FiscalCalendar} object that will be used by this item's DateChooser.
     *
     * @return the fiscal calendar for this chooser, if set, or the global            one otherwise
     */
    public native FiscalCalendar getFiscalCalendar() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getFiscalCalendar();
        if(ret == null) return null;
        return @com.smartgwt.client.widgets.FiscalCalendar::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

	/**
     * RelativeDateItems do not make use of the standard {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#formatEditorValue FormItem.formatEditorValue} and {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#parseEditorValue FormItem.parseEditorValue} methods. Developers can
     * customize the display values for these items in the following ways:<ul> <li>The {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presetOptions} map allows standard preset
     * RelativeDateString      and RelativeDateShortcut values to be mapped to custom display values</li> <li>The text
     * displayed for each of the {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getTimeUnitOptions
     * timeUnitOptions} (e.g:"N days ago") may be     customized via the per-time unit title attributes ({@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysFromNowTitle daysFromNowTitle},      {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDaysAgoTitle daysAgoTitle}, etc)</li> <li>The {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getDateFormatter dateFormatter} and {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getInputFormat inputFormat} may be used modify how date values 
     * are displayed (both in the text entry box and in the    {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getShowCalculatedDateField calculatedDateField}</li> </ul>
     */
    public native void parseEditorValue() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.parseEditorValue();
    }-*/;

	/**
     * Sets the {@link com.smartgwt.client.widgets.FiscalCalendar} object that will be used by this item's DateChooser.  If 
     * unset, the _link{Date.getFiscalCalendar, global fiscal calendar} is used.
     */
    public native void setFiscalCalendar() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.setFiscalCalendar();
    }-*/;

	/**
     * Sets the {@link com.smartgwt.client.widgets.FiscalCalendar} object that will be used by this item's DateChooser.  If 
     * unset, the _link{Date.getFiscalCalendar, global fiscal calendar} is used.
     * @param fiscalCalendar the fiscal calendar for this chooser, if set, or the global            one otherwise
     */
    public native void setFiscalCalendar(FiscalCalendar fiscalCalendar) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.setFiscalCalendar(fiscalCalendar == null ? null : fiscalCalendar.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;


    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties of the class instance passed to this function.
     * This is a powerful feature that eliminates the need for users to create a separate
     * hierarchy of subclasses that only alter the default properties of this class. Can also
     * be used for skinning / styling purposes.  <P> <b>Note:</b> This method is intended for
     * setting default attributes only and will affect all instances of the underlying class
     * (including those automatically generated in JavaScript).  This method should not be used
     * to apply standard EventHandlers or override methods for a class - use a custom subclass
     * instead.  Calling this method after instances have been created can result in undefined
     * behavior, since it bypasses any setters and a class instance may have already examined 
     * a particular property and not be expecting any changes through this route.
     *
     * @param relativeDateItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(RelativeDateItem relativeDateItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},relativeDateItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.RelativeDateItem.addProperties(properties);
    }-*/;

    // ***********************************************************


    /**
     * Returns the RelativeDate for the current value.
     *
     * @return the RelativeDate for the current value or null if not set
     */
    public native RelativeDate getRelativeDate() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var retVal = self.getRelativeDate();
        if(retVal == null || retVal === undefined) {
            return null;
        } else {
            return @com.smartgwt.client.data.RelativeDate::new(Lcom/google/gwt/core/client/JavaScriptObject;)(retVal);
        }
    }-*/;
    
    /**
     * Converts a RelativeDate to a concrete Date.
     * @param relativeDate the relative date to convert
     *
     * @return resulting absolute date value
     */
    public static native Date getAbsoluteDate(RelativeDate relativeDate) /*-{
        var retVal = $wnd.isc.RelativeDateItem.getAbsoluteDate(relativeDate.@com.smartgwt.client.data.RelativeDate::getJsObj()());
        if(retVal == null || retVal === undefined) {
            return null;
        } else {
            return @com.smartgwt.client.util.JSOHelper::toDate(D)(retVal.getTime());
        }
    }-*/;

    /**
     * Converts a RelativeDate to a concrete Date.
     * @param relativeDate the relative date to convert
     * @param baseDate base value for conversion.  Defaults to today
     *
     * @return resulting absolute date value
     */
    public static native Date getAbsoluteDate(RelativeDate relativeDate, Date baseDate) /*-{
        var retVal =$wnd.isc.RelativeDateItem.getAbsoluteDate(relativeDate.@com.smartgwt.client.data.RelativeDate::getJsObj()(),
                                                              @com.smartgwt.client.util.JSOHelper::convertToJavaScriptDate(Ljava/util/Date;)(baseDate));
        if(retVal == null || retVal === undefined) {
            return null;
        } else {
                return @com.smartgwt.client.util.JSOHelper::toDate(D)(retVal.getTime());
        }
    }-*/;
    
    /**
     * Set up a set of standard relative dates such as "today" or "tomorrow" that the user can choose directly from
     * the valueField of this item.
     * <P>
     * This is similar to a standard {@link FormItem::setValueMap(), valueMap} - the parameter passed in should be
     * a HashMap mapping RelativeDate strings to display values.
     * 
     * The default set of preset options (expressed in JSON) are:
     * <pre>
     * {
     *  "$today" : "Today",
     *  "$yesterday" : "Yesterday",
     *  "$tomorrow" : "Tomorrow",
     *  "-1w" : "Current day of last week",
     *  "+1w" : "Current day of next week",
     *  "-1m" : "Current day of last month",
     *  "+1m" : "Current day of next month"
     *  }
     *  </pre>
     *  In addition to these presets, options are shown for each of the {@link #setTimeUnitOptions,time unit options}.
     *
     * @param 
     */
    public void setPresetOptions(java.util.LinkedHashMap valueMap) {
        setAttribute("presetOptions", valueMap);
        
    }
    
    /**
     * A map from a granularity of time specified by a user to the granularity of time used for 
     * rounding.
     * <P>
     * A relative date such as "n days from now" is normally shifted to the end of the day when 
     * used as a range endpoint, and the beginning of the day when used as the beginning of a range.
     * (The rounding direction on some item can be specified via 
     * +link{relativeDateItem.rangePosition}).
     * This causes the intuitive behavior that "from yesterday to today" is from the beginning of
     * yesterday to the end of today, and that "from today until 5 days from now" includes the 
     * entirety of Friday if today is Monday.
     * <P>
     * This same rule <i>can</i> be applied to any time granularity, such that "from now until 
     * 20 minutes from now" is up to 5:32 if it is now 5:11:34, and 
     * "from now until 2 months from now" means end of June if it is mid-April.
     * <P>
     * User intuitions about where this rounding is expected for any given time period tend to
     * vary based on what kind of event is being discussed and subtle phrasing differences 
     * (consider "up to one year from now", "until next year", "within the next couple of years"). 
     * The defaults behaviors are:
     * <ul>
     * <li> for days, weeks and months round to <b>day</b> end/beginning
     * <li> for hours, round to <b>minute</b> end/beginning
     * <li> for minutes and seconds, round to <b>second</b> end/beginning
     * </ul>
     * To customize this rounding behavior, this attribute may be set to a Map
     * mapping each timeUnit to the granularity for that timeUnit.<br>
     * For example the following config code would produce an item where the user could select
     * only day or week values, and the selected value would be rounded to the beginning of the day
     * if a day was selected, or the beginning of the week if a week was selected:
     * <pre>
     *  RelativeDateItem fromDate = new RelativeDateItem("from");
     *  fromDate.setRangePosition(RelativeDateRangePosition.START);
     *  fromDate.setTimeUnitOptions(TimeUnit.DAY, TimeUnit.WEEK);
     *    
     *  Map<TimeUnit,TimeUnit> roundingMap = new HashMap<TimeUnit,TimeUnit>();
     *  roundingMap.put(TimeUnit.DAY, TimeUnit.DAY);
     *  roundingMap.put(TimeUnit.WEEK, TimeUnit.WEEK);
     *  fromDate.setRangeRoundingGranularity(roundingMap);
     * </pre>
     * 
     * @param rangeRoundingGranularity
     */
     
    public void setRangeRoundingGranularity(java.util.Map rangeRoundingGranularity) {
        JavaScriptObject jsMap = com.smartgwt.client.util.JSOHelper.createObject();
        java.util.Iterator i = rangeRoundingGranularity.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            TimeUnit key = (TimeUnit) e.getKey();
            TimeUnit val = (TimeUnit) e.getValue();
            
            JSOHelper.setAttribute(jsMap,key.getValue(), val.getValue());
        }
        setAttribute("rangeRoundingGranularity", jsMap);
    }
    /**
     * Format for displaying dates in the {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getValueField
     * valueField} and {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getCalculatedDateField
     * calculatedDateField}.   Defaults to the system-wide default established by  Date.setShortDisplayFormat, or if this item
     * has its type specified as datetime,  Date.setShortDatetimeDisplayFormat.
     *
     * @param dateFormatter dateFormatter Default value is null
     */
    public void setDateFormatter(DateDisplayFormat dateFormatter) {
        setAttribute("dateFormatter", dateFormatter.getValue());
    }
    
    
    /**
     * Formatter function for displaying dates in the 
     * {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getValueField
     * valueField} and {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#getCalculatedDateField
     * calculatedDateField} in some custom format. Typically the {@link #setDateParser(DateParser)} method should
     * also be applied to ensure dates can be both formatted and edited date strings parsed back into actual
     * date values.
     * @param dateFormatter dateFormatter Default value is null
     */
    public native void setDateFormatter(DateDisplayFormatter formatter) /*-{
        var formatterFunc = function() {
            var date = this;
            var dateJ = date == null || date === undefined ? null : @com.smartgwt.client.util.JSOHelper::toDate(D)(date.getTime());
            return formatter.@com.smartgwt.client.util.DateDisplayFormatter::format(Ljava/util/Date;)(dateJ); 
        }
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.dateFormatter = formatterFunc;
    }-*/;
    
    /**
     * Custom date parser function for direct user input of date values. Typically used in conjunction with 
     * {@link #setDateFormatter(DateDisplayFormatter)}.
     * <P> 
     * Note that {@link #setDateFormatter(DateDisplayFormat)} and 
     * {@link com.smartgwt.client.widgets.form.fields.RelativeDateItem#setInputFormat(String)} already
     * provide a mechanism for customizing the display format for date values displayed in this item.
     *
     */
    public native void setDateParser(DateParser parser) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.inputFormat = function(dateStr) {
                var dateJ = parser.@com.smartgwt.client.util.DateParser::parse(Ljava/lang/String;)(dateStr);
                if(dateJ == null) return null;
                return @com.smartgwt.client.util.JSOHelper::toDateJS(Ljava/util/Date;)(dateJ);
        }
    }-*/;

    /**
     *  RelativeDateItems do not make use of the standard FormItem.setEditorValueFormatter() and
     *   FormItem.setEditorValueParser() methods. Developers can customize the display values for these items in
     *   the following ways:
     *   <UL>
     *   <LI>The RelativeDateItem.presetOptions map allows standard preset RelativeDateString 
     *      and RelativeDateShortcut values to be mapped to custom display values</LI>
     *   <LI>The text displayed for each of the RelativeDateItem.timeUnitOptions (e.g:"N days ago") 
     *       may be customized via the per-time unit title attributes (RelativeDateItem.daysFromNowTitle,
     *       RelativeDateItem.daysAgoTitle, etc)</LI>
     *   <LI>setDateFormatter and setInputFormat / setDateParser may be used modify how date values 
     *        are displayed (both in the text entry box and in the calculatedDateField)</LI>
     *   </UL>
     */
    public void setEditorValueParser(FormItemValueParser parser) {
        SC.logWarn("setEditorValueParser not supported for RelativeDateItems, please use setDateFormatter and setDateParser instead.");
    }
    
    /**
     *  RelativeDateItems do not make use of the standard FormItem.setEditorValueFormatter() and
     *   FormItem.setEditorValueParser() methods. Developers can customize the display values for these items in
     *   the following ways:
     *   <UL>
     *   <LI>The RelativeDateItem.presetOptions map allows standard preset RelativeDateString 
     *      and RelativeDateShortcut values to be mapped to custom display values</LI>
     *   <LI>The text displayed for each of the RelativeDateItem.timeUnitOptions (e.g:"N days ago") 
     *       may be customized via the per-time unit title attributes (RelativeDateItem.daysFromNowTitle,
     *       RelativeDateItem.daysAgoTitle, etc)</LI>
     *   <LI>setDateFormatter and setInputFormat / setDateParser may be used modify how date values 
     *        are displayed (both in the text entry box and in the calculatedDateField)</LI>
     *   </UL>
     */
    public void setEditorValueFormatter(FormItemValueFormatter formatter) {
        SC.logWarn("setEditorValueFormatter not supported for RelativeDateItems, please use setDateFormatter and setDateParser instead.");
    }

    /**
     * {@link com.smartgwt.client.widgets.form.fields.ComboBoxItem} field where a user may choose among  {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getPresetOptions presets},  {@link
     * com.smartgwt.client.types.TimeUnit time unit} plus {@link
     * com.smartgwt.client.widgets.form.fields.RelativeDateItem#getQuantityField quantity}, or  direct entry of a date as text.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return ComboBoxItem
     */
    public ComboBoxItem getValueFieldComboBox()  {
        return ComboBoxItem.getOrCreateRef(getAttributeAsJavaScriptObject("valueField"));
    }

}


