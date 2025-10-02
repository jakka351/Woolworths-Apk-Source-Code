package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.android.datatransport.cct.internal.AutoValue_ComplianceData;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class ComplianceData {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        public abstract ComplianceData a();

        public abstract Builder b(ExternalPrivacyContext externalPrivacyContext);

        public abstract Builder c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class ProductIdOrigin {
        public static final ProductIdOrigin d;
        public static final /* synthetic */ ProductIdOrigin[] e;

        /* JADX INFO: Fake field, exist only in values array */
        ProductIdOrigin EF0;

        static {
            ProductIdOrigin productIdOrigin = new ProductIdOrigin("NOT_SET", 0);
            ProductIdOrigin productIdOrigin2 = new ProductIdOrigin("EVENT_OVERRIDE", 1);
            d = productIdOrigin2;
            e = new ProductIdOrigin[]{productIdOrigin, productIdOrigin2};
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        public static ProductIdOrigin valueOf(String str) {
            return (ProductIdOrigin) Enum.valueOf(ProductIdOrigin.class, str);
        }

        public static ProductIdOrigin[] values() {
            return (ProductIdOrigin[]) e.clone();
        }
    }

    public static Builder a() {
        return new AutoValue_ComplianceData.Builder();
    }

    public abstract ExternalPrivacyContext b();

    public abstract ProductIdOrigin c();
}
