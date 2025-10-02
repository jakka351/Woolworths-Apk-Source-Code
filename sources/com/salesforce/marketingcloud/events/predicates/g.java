package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.events.g;
import java.util.Locale;

@SuppressLint
/* loaded from: classes6.dex */
public class g extends h<String> {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16894a;

        static {
            int[] iArr = new int[g.a.values().length];
            f16894a = iArr;
            try {
                iArr[g.a.f16887a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16894a[g.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16894a[g.a.g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(@Nullable Object obj, @NonNull g.a aVar, @Nullable Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    public boolean a(@Nullable String str, @NonNull g.a aVar, @Nullable String str2) throws UnsupportedOperationException {
        if (str == null || str2 == null) {
            return false;
        }
        int i = a.f16894a[aVar.ordinal()];
        if (i == 1) {
            return str.equalsIgnoreCase(str2);
        }
        if (i == 2) {
            return !str.equalsIgnoreCase(str2);
        }
        if (i == 3) {
            return str.matches(str2);
        }
        Locale locale = Locale.ENGLISH;
        throw new UnsupportedOperationException("Operator " + aVar + " not supported for String data types.");
    }
}
