package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ContentMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1();
    public BranchContentSchema d;
    public Double e;
    public Double f;
    public CurrencyType g;
    public String h;
    public String i;
    public String j;
    public ProductCategory k;
    public CONDITION l;
    public String m;
    public Double n;
    public Double o;
    public Integer p;
    public Double q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public Double w;
    public Double x;
    public final ArrayList y = new ArrayList();
    public final HashMap z = new HashMap();

    /* renamed from: io.branch.referral.util.ContentMetadata$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BranchContentSchema branchContentSchema;
            ContentMetadata contentMetadata = new ContentMetadata();
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                branchContentSchema = null;
            } else {
                BranchContentSchema[] branchContentSchemaArrValues = BranchContentSchema.values();
                int length = branchContentSchemaArrValues.length;
                for (int i = 0; i < length; i++) {
                    branchContentSchema = branchContentSchemaArrValues[i];
                    if (branchContentSchema.name().equalsIgnoreCase(string)) {
                        break;
                    }
                }
                branchContentSchema = null;
            }
            contentMetadata.d = branchContentSchema;
            contentMetadata.e = (Double) parcel.readSerializable();
            contentMetadata.f = (Double) parcel.readSerializable();
            contentMetadata.g = CurrencyType.a(parcel.readString());
            contentMetadata.h = parcel.readString();
            contentMetadata.i = parcel.readString();
            contentMetadata.j = parcel.readString();
            contentMetadata.k = ProductCategory.a(parcel.readString());
            contentMetadata.l = CONDITION.a(parcel.readString());
            contentMetadata.m = parcel.readString();
            contentMetadata.n = (Double) parcel.readSerializable();
            contentMetadata.o = (Double) parcel.readSerializable();
            contentMetadata.p = (Integer) parcel.readSerializable();
            contentMetadata.q = (Double) parcel.readSerializable();
            contentMetadata.r = parcel.readString();
            contentMetadata.s = parcel.readString();
            contentMetadata.t = parcel.readString();
            contentMetadata.u = parcel.readString();
            contentMetadata.v = parcel.readString();
            contentMetadata.w = (Double) parcel.readSerializable();
            contentMetadata.x = (Double) parcel.readSerializable();
            contentMetadata.y.addAll((ArrayList) parcel.readSerializable());
            contentMetadata.z.putAll((HashMap) parcel.readSerializable());
            return contentMetadata;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContentMetadata[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CONDITION {
        public static final /* synthetic */ CONDITION[] d = {new CONDITION("OTHER", 0), new CONDITION("NEW", 1), new CONDITION("GOOD", 2), new CONDITION("FAIR", 3), new CONDITION("POOR", 4), new CONDITION("USED", 5), new CONDITION("REFURBISHED", 6), new CONDITION("EXCELLENT", 7)};

        /* JADX INFO: Fake field, exist only in values array */
        CONDITION EF5;

        public static CONDITION a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (CONDITION condition : values()) {
                if (condition.name().equalsIgnoreCase(str)) {
                    return condition;
                }
            }
            return null;
        }

        public static CONDITION valueOf(String str) {
            return (CONDITION) Enum.valueOf(CONDITION.class, str);
        }

        public static CONDITION[] values() {
            return (CONDITION[]) d.clone();
        }
    }

    public final void a(String str, String str2) {
        this.z.put(str, str2);
    }

    public final void b(String... strArr) {
        Collections.addAll(this.y, strArr);
    }

    public final JSONObject c() throws JSONException {
        ArrayList arrayList = this.y;
        HashMap map = this.z;
        JSONObject jSONObject = new JSONObject();
        try {
            BranchContentSchema branchContentSchema = this.d;
            if (branchContentSchema != null) {
                jSONObject.put("$content_schema", branchContentSchema.name());
            }
            Double d = this.e;
            if (d != null) {
                jSONObject.put("$quantity", d);
            }
            Double d2 = this.f;
            if (d2 != null) {
                jSONObject.put("$price", d2);
            }
            CurrencyType currencyType = this.g;
            if (currencyType != null) {
                jSONObject.put("$currency", currencyType.d);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put("$sku", this.h);
            }
            if (!TextUtils.isEmpty(this.i)) {
                jSONObject.put("$product_name", this.i);
            }
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put("$product_brand", this.j);
            }
            ProductCategory productCategory = this.k;
            if (productCategory != null) {
                jSONObject.put("$product_category", productCategory.d);
            }
            CONDITION condition = this.l;
            if (condition != null) {
                jSONObject.put("$condition", condition.name());
            }
            if (!TextUtils.isEmpty(this.m)) {
                jSONObject.put("$product_variant", this.m);
            }
            Double d3 = this.n;
            if (d3 != null) {
                jSONObject.put("$rating", d3);
            }
            Double d4 = this.o;
            if (d4 != null) {
                jSONObject.put("$rating_average", d4);
            }
            Integer num = this.p;
            if (num != null) {
                jSONObject.put("$rating_count", num);
            }
            Double d5 = this.q;
            if (d5 != null) {
                jSONObject.put("$rating_max", d5);
            }
            if (!TextUtils.isEmpty(this.r)) {
                jSONObject.put("$address_street", this.r);
            }
            if (!TextUtils.isEmpty(this.s)) {
                jSONObject.put("$address_city", this.s);
            }
            if (!TextUtils.isEmpty(this.t)) {
                jSONObject.put("$address_region", this.t);
            }
            if (!TextUtils.isEmpty(this.u)) {
                jSONObject.put("$address_country", this.u);
            }
            if (!TextUtils.isEmpty(this.v)) {
                jSONObject.put("$address_postal_code", this.v);
            }
            Double d6 = this.w;
            if (d6 != null) {
                jSONObject.put("$latitude", d6);
            }
            Double d7 = this.x;
            if (d7 != null) {
                jSONObject.put("$longitude", d7);
            }
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("$image_captions", jSONArray);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (map.size() > 0) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public final void d(Double d) {
        this.e = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BranchContentSchema branchContentSchema = this.d;
        parcel.writeString(branchContentSchema != null ? branchContentSchema.name() : "");
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        CurrencyType currencyType = this.g;
        parcel.writeString(currencyType != null ? currencyType.name() : "");
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        ProductCategory productCategory = this.k;
        parcel.writeString(productCategory != null ? productCategory.d : "");
        CONDITION condition = this.l;
        parcel.writeString(condition != null ? condition.name() : "");
        parcel.writeString(this.m);
        parcel.writeSerializable(this.n);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.p);
        parcel.writeSerializable(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.z);
    }
}
