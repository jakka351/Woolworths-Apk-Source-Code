package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.events.g;
import java.util.Locale;

@SuppressLint
/* loaded from: classes6.dex */
public class c extends h<Double> {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16891a;

        static {
            int[] iArr = new int[g.a.values().length];
            f16891a = iArr;
            try {
                iArr[g.a.f16887a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16891a[g.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16891a[g.a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16891a[g.a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16891a[g.a.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16891a[g.a.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(@Nullable Object obj, @NonNull g.a aVar, @Nullable Object obj2) {
        super(obj, aVar, obj2);
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // com.salesforce.marketingcloud.events.predicates.h
    public boolean a(@Nullable Double d, @NonNull g.a aVar, @Nullable Double d2) throws UnsupportedOperationException {
        if (d != null && d2 != null) {
            double dDoubleValue = d.doubleValue();
            double dDoubleValue2 = d2.doubleValue();
            switch (a.f16891a[aVar.ordinal()]) {
                case 1:
                    if (dDoubleValue == dDoubleValue2) {
                        return true;
                    }
                    break;
                case 2:
                    if (dDoubleValue != dDoubleValue2) {
                        return true;
                    }
                    break;
                case 3:
                    if (dDoubleValue < dDoubleValue2) {
                        return true;
                    }
                    break;
                case 4:
                    if (dDoubleValue > dDoubleValue2) {
                        return true;
                    }
                    break;
                case 5:
                    if (dDoubleValue <= dDoubleValue2) {
                        return true;
                    }
                    break;
                case 6:
                    if (dDoubleValue >= dDoubleValue2) {
                        return true;
                    }
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    throw new UnsupportedOperationException("Operator " + aVar + " not supported for Double data types.");
            }
        }
        return false;
    }
}
