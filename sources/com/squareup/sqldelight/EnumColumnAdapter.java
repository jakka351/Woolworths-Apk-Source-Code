package com.squareup.sqldelight;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.Enum;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/squareup/sqldelight/EnumColumnAdapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/squareup/sqldelight/ColumnAdapter;", "", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class EnumColumnAdapter<T extends Enum<T>> implements ColumnAdapter<T, String> {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f19029a;

    public EnumColumnAdapter(Enum[] enumValues) {
        Intrinsics.h(enumValues, "enumValues");
        this.f19029a = enumValues;
    }

    @Override // com.squareup.sqldelight.ColumnAdapter
    public final Object decode(Object obj) {
        String str = (String) obj;
        for (Enum r3 : this.f19029a) {
            if (Intrinsics.c(r3.name(), str)) {
                return r3;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.squareup.sqldelight.ColumnAdapter
    public final Object encode(Object obj) {
        Enum value = (Enum) obj;
        Intrinsics.h(value, "value");
        return value.name();
    }
}
