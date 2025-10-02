package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ErrorTypeKind {
    public static final ErrorTypeKind A;
    public static final ErrorTypeKind B;
    public static final ErrorTypeKind C;
    public static final ErrorTypeKind D;
    public static final ErrorTypeKind E;
    public static final ErrorTypeKind F;
    public static final ErrorTypeKind G;
    public static final ErrorTypeKind H;
    public static final /* synthetic */ ErrorTypeKind[] I;
    public static final /* synthetic */ EnumEntries J;
    public static final ErrorTypeKind f;
    public static final ErrorTypeKind g;
    public static final ErrorTypeKind h;
    public static final ErrorTypeKind i;
    public static final ErrorTypeKind j;
    public static final ErrorTypeKind k;
    public static final ErrorTypeKind l;
    public static final ErrorTypeKind m;
    public static final ErrorTypeKind n;
    public static final ErrorTypeKind o;
    public static final ErrorTypeKind p;
    public static final ErrorTypeKind q;
    public static final ErrorTypeKind r;
    public static final ErrorTypeKind s;
    public static final ErrorTypeKind t;
    public static final ErrorTypeKind u;
    public static final ErrorTypeKind v;
    public static final ErrorTypeKind w;
    public static final ErrorTypeKind x;
    public static final ErrorTypeKind y;
    public static final ErrorTypeKind z;
    public final String d;
    public final boolean e;

    static {
        ErrorTypeKind errorTypeKind = new ErrorTypeKind("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
        ErrorTypeKind errorTypeKind2 = new ErrorTypeKind("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
        ErrorTypeKind errorTypeKind3 = new ErrorTypeKind("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
        ErrorTypeKind errorTypeKind4 = new ErrorTypeKind("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
        f = errorTypeKind4;
        ErrorTypeKind errorTypeKind5 = new ErrorTypeKind("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
        ErrorTypeKind errorTypeKind6 = new ErrorTypeKind("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
        g = errorTypeKind6;
        ErrorTypeKind errorTypeKind7 = new ErrorTypeKind("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false);
        ErrorTypeKind errorTypeKind8 = new ErrorTypeKind("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false);
        ErrorTypeKind errorTypeKind9 = new ErrorTypeKind("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false);
        h = errorTypeKind9;
        ErrorTypeKind errorTypeKind10 = new ErrorTypeKind("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false);
        ErrorTypeKind errorTypeKind11 = new ErrorTypeKind("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false);
        ErrorTypeKind errorTypeKind12 = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false);
        ErrorTypeKind errorTypeKind13 = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false);
        ErrorTypeKind errorTypeKind14 = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false);
        ErrorTypeKind errorTypeKind15 = new ErrorTypeKind("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false);
        ErrorTypeKind errorTypeKind16 = new ErrorTypeKind("RECURSIVE_TYPE", 15, "Recursive type", false);
        ErrorTypeKind errorTypeKind17 = new ErrorTypeKind("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false);
        i = errorTypeKind17;
        ErrorTypeKind errorTypeKind18 = new ErrorTypeKind("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false);
        ErrorTypeKind errorTypeKind19 = new ErrorTypeKind("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false);
        j = errorTypeKind19;
        ErrorTypeKind errorTypeKind20 = new ErrorTypeKind("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false);
        k = errorTypeKind20;
        ErrorTypeKind errorTypeKind21 = new ErrorTypeKind("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false);
        ErrorTypeKind errorTypeKind22 = new ErrorTypeKind("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false);
        l = errorTypeKind22;
        ErrorTypeKind errorTypeKind23 = new ErrorTypeKind("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false);
        m = errorTypeKind23;
        ErrorTypeKind errorTypeKind24 = new ErrorTypeKind("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false);
        ErrorTypeKind errorTypeKind25 = new ErrorTypeKind("ERROR_EXPECTED_TYPE", 24, "Error expected type", false);
        ErrorTypeKind errorTypeKind26 = new ErrorTypeKind("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false);
        ErrorTypeKind errorTypeKind27 = new ErrorTypeKind("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false);
        ErrorTypeKind errorTypeKind28 = new ErrorTypeKind("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false);
        n = errorTypeKind28;
        ErrorTypeKind errorTypeKind29 = new ErrorTypeKind("DONT_CARE", 28, "Special DONT_CARE type", false);
        o = errorTypeKind29;
        ErrorTypeKind errorTypeKind30 = new ErrorTypeKind("STUB_TYPE", 29, "Stub type %s", false);
        ErrorTypeKind errorTypeKind31 = new ErrorTypeKind("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false);
        ErrorTypeKind errorTypeKind32 = new ErrorTypeKind("TYPE_FOR_COMPILER_EXCEPTION", 31, "Error type for a compiler exception while analyzing %s", false);
        ErrorTypeKind errorTypeKind33 = new ErrorTypeKind("ERROR_FLEXIBLE_TYPE", 32, "Error java flexible type with id %s. (%s..%s)", false);
        p = errorTypeKind33;
        ErrorTypeKind errorTypeKind34 = new ErrorTypeKind("ERROR_RAW_TYPE", 33, "Error raw type %s", false);
        q = errorTypeKind34;
        ErrorTypeKind errorTypeKind35 = new ErrorTypeKind("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 34, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false);
        ErrorTypeKind errorTypeKind36 = new ErrorTypeKind("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 35, "Illegal type range for dynamic type %s..%s", false);
        ErrorTypeKind errorTypeKind37 = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 36, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false);
        r = errorTypeKind37;
        ErrorTypeKind errorTypeKind38 = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 37, "Couldn't deserialize type parameter %s in %s", false);
        s = errorTypeKind38;
        ErrorTypeKind errorTypeKind39 = new ErrorTypeKind("INCONSISTENT_SUSPEND_FUNCTION", 38, "Inconsistent suspend function type in metadata with constructor %s", false);
        t = errorTypeKind39;
        ErrorTypeKind errorTypeKind40 = new ErrorTypeKind("UNEXPECTED_FLEXIBLE_TYPE_ID", 39, "Unexpected id of a flexible type %s. (%s..%s)", false);
        ErrorTypeKind errorTypeKind41 = new ErrorTypeKind("UNKNOWN_TYPE", 40, "Unknown type", false);
        u = errorTypeKind41;
        ErrorTypeKind errorTypeKind42 = new ErrorTypeKind("NO_TYPE_SPECIFIED", 41, "No type specified for %s", false);
        ErrorTypeKind errorTypeKind43 = new ErrorTypeKind("NO_TYPE_FOR_LOOP_RANGE", 42, "Loop range has no type", false);
        ErrorTypeKind errorTypeKind44 = new ErrorTypeKind("NO_TYPE_FOR_LOOP_PARAMETER", 43, "Loop parameter has no type", false);
        ErrorTypeKind errorTypeKind45 = new ErrorTypeKind("MISSED_TYPE_FOR_PARAMETER", 44, "Missed a type for a value parameter %s", false);
        ErrorTypeKind errorTypeKind46 = new ErrorTypeKind("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 45, "Missed a type argument for a type parameter %s", false);
        v = errorTypeKind46;
        ErrorTypeKind errorTypeKind47 = new ErrorTypeKind("PARSE_ERROR_ARGUMENT", 46, "Error type for parse error argument %s", false);
        ErrorTypeKind errorTypeKind48 = new ErrorTypeKind("STAR_PROJECTION_IN_CALL", 47, "Error type for star projection directly passing as a call type argument", false);
        ErrorTypeKind errorTypeKind49 = new ErrorTypeKind("PROHIBITED_DYNAMIC_TYPE", 48, "Dynamic type in a not allowed context", false);
        ErrorTypeKind errorTypeKind50 = new ErrorTypeKind("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 49, "Not an annotation type %s in the annotation context", false);
        ErrorTypeKind errorTypeKind51 = new ErrorTypeKind("UNIT_RETURN_TYPE_FOR_INC_DEC", 50, "Unit type returned by inc or dec", false);
        ErrorTypeKind errorTypeKind52 = new ErrorTypeKind("RETURN_NOT_ALLOWED", 51, "Return not allowed", false);
        ErrorTypeKind errorTypeKind53 = new ErrorTypeKind("UNRESOLVED_PARCEL_TYPE", 52, "Unresolved 'Parcel' type", true);
        ErrorTypeKind errorTypeKind54 = new ErrorTypeKind("KAPT_ERROR_TYPE", 53, "Kapt error type", false);
        ErrorTypeKind errorTypeKind55 = new ErrorTypeKind("SYNTHETIC_ELEMENT_ERROR_TYPE", 54, "Error type for synthetic element", false);
        ErrorTypeKind errorTypeKind56 = new ErrorTypeKind("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 55, "Error type in ad hoc resolve for lighter classes", false);
        ErrorTypeKind errorTypeKind57 = new ErrorTypeKind("ERROR_EXPRESSION_TYPE", 56, "Error expression type", false);
        ErrorTypeKind errorTypeKind58 = new ErrorTypeKind("ERROR_RECEIVER_TYPE", 57, "Error receiver type for %s", false);
        ErrorTypeKind errorTypeKind59 = new ErrorTypeKind("ERROR_CONSTANT_VALUE", 58, "Error constant value %s", false);
        w = errorTypeKind59;
        ErrorTypeKind errorTypeKind60 = new ErrorTypeKind("EMPTY_CALLABLE_REFERENCE", 59, "Empty callable reference", false);
        ErrorTypeKind errorTypeKind61 = new ErrorTypeKind("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 60, "Unsupported callable reference type %s", false);
        ErrorTypeKind errorTypeKind62 = new ErrorTypeKind("TYPE_FOR_DELEGATION", 61, "Error delegation type for %s", false);
        ErrorTypeKind errorTypeKind63 = new ErrorTypeKind("UNAVAILABLE_TYPE_FOR_DECLARATION", 62, "Type is unavailable for declaration %s", false);
        ErrorTypeKind errorTypeKind64 = new ErrorTypeKind("ERROR_TYPE_PARAMETER", 63, "Error type parameter", false);
        ErrorTypeKind errorTypeKind65 = new ErrorTypeKind("ERROR_TYPE_PROJECTION", 64, "Error type projection", false);
        ErrorTypeKind errorTypeKind66 = new ErrorTypeKind("ERROR_SUPER_TYPE", 65, "Error super type", false);
        ErrorTypeKind errorTypeKind67 = new ErrorTypeKind("SUPER_TYPE_FOR_ERROR_TYPE", 66, "Supertype of error type %s", false);
        ErrorTypeKind errorTypeKind68 = new ErrorTypeKind("ERROR_PROPERTY_TYPE", 67, "Error property type", false);
        x = errorTypeKind68;
        ErrorTypeKind errorTypeKind69 = new ErrorTypeKind("ERROR_CLASS", 68, "Error class", false);
        y = errorTypeKind69;
        ErrorTypeKind errorTypeKind70 = new ErrorTypeKind("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 69, "Type for error type constructor (%s)", false);
        z = errorTypeKind70;
        ErrorTypeKind errorTypeKind71 = new ErrorTypeKind("INTERSECTION_OF_ERROR_TYPES", 70, "Intersection of error types %s", false);
        A = errorTypeKind71;
        ErrorTypeKind errorTypeKind72 = new ErrorTypeKind("CANNOT_COMPUTE_ERASED_BOUND", 71, "Cannot compute erased upper bound of a type parameter %s", false);
        B = errorTypeKind72;
        ErrorTypeKind errorTypeKind73 = new ErrorTypeKind("NOT_FOUND_UNSIGNED_TYPE", 72, "Unsigned type %s not found", false);
        C = errorTypeKind73;
        ErrorTypeKind errorTypeKind74 = new ErrorTypeKind("ERROR_ENUM_TYPE", 73, "Not found the corresponding enum class for given enum entry %s.%s", false);
        D = errorTypeKind74;
        ErrorTypeKind errorTypeKind75 = new ErrorTypeKind("NO_RECORDED_TYPE", 74, "Not found recorded type for %s", false);
        E = errorTypeKind75;
        ErrorTypeKind errorTypeKind76 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 75, "Descriptor not found for function %s", false);
        ErrorTypeKind errorTypeKind77 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 76, "Cannot build class type, descriptor not found for builder %s", false);
        ErrorTypeKind errorTypeKind78 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 77, "Cannot build type parameter type, descriptor not found for builder %s", false);
        ErrorTypeKind errorTypeKind79 = new ErrorTypeKind("UNMAPPED_ANNOTATION_TARGET_TYPE", 78, "Type for unmapped Java annotation target to Kotlin one", false);
        F = errorTypeKind79;
        ErrorTypeKind errorTypeKind80 = new ErrorTypeKind("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 79, "Unknown type for an array element of a java annotation argument", false);
        G = errorTypeKind80;
        ErrorTypeKind errorTypeKind81 = new ErrorTypeKind("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 80, "No fqName for annotation %s", false);
        H = errorTypeKind81;
        ErrorTypeKind[] errorTypeKindArr = {errorTypeKind, errorTypeKind2, errorTypeKind3, errorTypeKind4, errorTypeKind5, errorTypeKind6, errorTypeKind7, errorTypeKind8, errorTypeKind9, errorTypeKind10, errorTypeKind11, errorTypeKind12, errorTypeKind13, errorTypeKind14, errorTypeKind15, errorTypeKind16, errorTypeKind17, errorTypeKind18, errorTypeKind19, errorTypeKind20, errorTypeKind21, errorTypeKind22, errorTypeKind23, errorTypeKind24, errorTypeKind25, errorTypeKind26, errorTypeKind27, errorTypeKind28, errorTypeKind29, errorTypeKind30, errorTypeKind31, errorTypeKind32, errorTypeKind33, errorTypeKind34, errorTypeKind35, errorTypeKind36, errorTypeKind37, errorTypeKind38, errorTypeKind39, errorTypeKind40, errorTypeKind41, errorTypeKind42, errorTypeKind43, errorTypeKind44, errorTypeKind45, errorTypeKind46, errorTypeKind47, errorTypeKind48, errorTypeKind49, errorTypeKind50, errorTypeKind51, errorTypeKind52, errorTypeKind53, errorTypeKind54, errorTypeKind55, errorTypeKind56, errorTypeKind57, errorTypeKind58, errorTypeKind59, errorTypeKind60, errorTypeKind61, errorTypeKind62, errorTypeKind63, errorTypeKind64, errorTypeKind65, errorTypeKind66, errorTypeKind67, errorTypeKind68, errorTypeKind69, errorTypeKind70, errorTypeKind71, errorTypeKind72, errorTypeKind73, errorTypeKind74, errorTypeKind75, errorTypeKind76, errorTypeKind77, errorTypeKind78, errorTypeKind79, errorTypeKind80, errorTypeKind81, new ErrorTypeKind("NOT_FOUND_FQNAME", 81, "No fqName for %s", false), new ErrorTypeKind("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 82, "Type for generated error expression", false)};
        I = errorTypeKindArr;
        J = EnumEntriesKt.a(errorTypeKindArr);
    }

    public ErrorTypeKind(String str, int i2, String str2, boolean z2) {
        this.d = str2;
        this.e = z2;
    }

    public static ErrorTypeKind valueOf(String str) {
        return (ErrorTypeKind) Enum.valueOf(ErrorTypeKind.class, str);
    }

    public static ErrorTypeKind[] values() {
        return (ErrorTypeKind[]) I.clone();
    }
}
