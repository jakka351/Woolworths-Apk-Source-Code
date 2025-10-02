package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentDataType;", "Landroidx/compose/ui/autofill/ContentDataType;", "androidAutofillType", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
final class AndroidContentDataType implements ContentDataType {
    public final boolean equals(Object obj) {
        return obj instanceof AndroidContentDataType;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=1)";
    }
}
