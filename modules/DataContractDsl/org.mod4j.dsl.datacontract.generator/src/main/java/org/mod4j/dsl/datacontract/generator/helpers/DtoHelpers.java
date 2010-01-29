/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mod4j.dsl.datacontract.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoBooleanProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDateTimeProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoDecimalProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoEnumerationProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoIntegerProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DtoStringProperty;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
// import org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;

public class DtoHelpers {

    public static String getBaseDtoName (Dto dto){
//        if( dto instanceof BusinessClassDto ){
            return ModelHelpers.javaClassName( ((BusinessClassDto)dto).getName());
//        } else if( dto instanceof ListDto ){
//            Dto tmp = ((ListDto)dto).getBaseDto();
//            return getBaseDtoName(tmp);
//        }
//        return null;
    }

    public static String getBaseDtoBusinessClassName (Dto dto){
//        if( dto instanceof BusinessClassDto ){
            return ModelHelpers.javaClassName( ((BusinessClassDto)dto).getBase().getName());
//        } else if( dto instanceof ListDto ){
//            Dto tmp = ((ListDto)dto).getBaseDto();
//            return getBaseDtoBusinessClassName(tmp);
//        }
//        return null;
    }

    public static String javaType(DtoProperty p) {
        if (p instanceof DtoBooleanProperty) {
            return javaType((DtoBooleanProperty) p);
        } else if (p instanceof DtoStringProperty) {
            return javaType((DtoStringProperty) p);
        } else if (p instanceof DtoIntegerProperty) {
            return javaType((DtoIntegerProperty) p);
        } else if (p instanceof DtoDecimalProperty) {
            return javaType((DtoDecimalProperty) p);
        } else if (p instanceof DtoEnumerationProperty) {
            return javaType((DtoEnumerationProperty) p);
        } else if (p instanceof DtoDateTimeProperty) {
            return javaType((DtoDateTimeProperty) p);
        }
        return "Object";
    }

    public static String javaType(DtoBooleanProperty p) {
        // return p.isNullable() ? "Boolean" : "boolean";
        return "Boolean";
    }

    public static String javaType(DtoDateTimeProperty p) {
        return "DateTime";
    }

    public static String javaType(DtoEnumerationProperty p) {
        EnumerationDto e = p.getType();
        if (e == null) {
            System.err.println("ERROR in javaType() for EnumerationProperty");
            return "Object";
        }
        return ModelHelpers.javaClassName(p.getType().getName());
    }

    public static String javaType(DtoStringProperty p) {
        return "String";
    }

    public static String javaType(DtoIntegerProperty p) {
        // return p.isNullable() ? "Integer" : "int";
        return "Integer";
    }

    public static String javaType(DtoDecimalProperty p) {
        // return p.isNullable() ? "Float" : "float";
        return "Float";
    }

    public static List<DtoProperty> getAllProperties(BusinessClassDto cls) {
        List<DtoProperty> result = new ArrayList<DtoProperty>();
        result.addAll(cls.getProperties());
        return result;
    }
    
    public static String javaTranslatorName(String clsName){
        return ModelHelpers.javaClassName(clsName) + "Translator";
    }
    
}
