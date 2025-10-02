package androidx.compose.material3.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldType {
    public static final TextFieldType d;
    public static final TextFieldType e;
    public static final /* synthetic */ TextFieldType[] f;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        d = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        e = textFieldType2;
        f = new TextFieldType[]{textFieldType, textFieldType2};
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f.clone();
    }
}
