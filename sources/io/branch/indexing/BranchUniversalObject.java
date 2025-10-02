package io.branch.indexing;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.snapshots.a;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import io.branch.referral.BranchShortLinkBuilder;
import io.branch.referral.PrefHelper;
import io.branch.referral.util.ContentMetadata;
import io.branch.referral.util.LinkProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BranchUniversalObject implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1();
    public String h;
    public CONTENT_INDEX_MODE j;
    public long l;
    public CONTENT_INDEX_MODE m;
    public long n;
    public ContentMetadata i = new ContentMetadata();
    public final ArrayList k = new ArrayList();
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    /* renamed from: io.branch.indexing.BranchUniversalObject$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BranchUniversalObject branchUniversalObject = new BranchUniversalObject();
            branchUniversalObject.n = parcel.readLong();
            branchUniversalObject.d = parcel.readString();
            branchUniversalObject.e = parcel.readString();
            branchUniversalObject.f = parcel.readString();
            branchUniversalObject.g = parcel.readString();
            branchUniversalObject.h = parcel.readString();
            branchUniversalObject.l = parcel.readLong();
            branchUniversalObject.j = CONTENT_INDEX_MODE.values()[parcel.readInt()];
            ArrayList arrayList = (ArrayList) parcel.readSerializable();
            if (arrayList != null) {
                branchUniversalObject.k.addAll(arrayList);
            }
            branchUniversalObject.i = (ContentMetadata) parcel.readParcelable(ContentMetadata.class.getClassLoader());
            branchUniversalObject.m = CONTENT_INDEX_MODE.values()[parcel.readInt()];
            return branchUniversalObject;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BranchUniversalObject[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CONTENT_INDEX_MODE {
        public static final CONTENT_INDEX_MODE d;
        public static final /* synthetic */ CONTENT_INDEX_MODE[] e;

        static {
            CONTENT_INDEX_MODE content_index_mode = new CONTENT_INDEX_MODE("PUBLIC", 0);
            d = content_index_mode;
            e = new CONTENT_INDEX_MODE[]{content_index_mode, new CONTENT_INDEX_MODE("PRIVATE", 1)};
        }

        public static CONTENT_INDEX_MODE valueOf(String str) {
            return (CONTENT_INDEX_MODE) Enum.valueOf(CONTENT_INDEX_MODE.class, str);
        }

        public static CONTENT_INDEX_MODE[] values() {
            return (CONTENT_INDEX_MODE[]) e.clone();
        }
    }

    public class LinkShareListenerWrapper implements Branch.BranchLinkShareListener {
    }

    public interface RegisterViewStatusListener {
    }

    public BranchUniversalObject() {
        CONTENT_INDEX_MODE content_index_mode = CONTENT_INDEX_MODE.d;
        this.j = content_index_mode;
        this.m = content_index_mode;
        this.l = 0L;
        this.n = System.currentTimeMillis();
    }

    public final JSONObject a() throws JSONException {
        ArrayList arrayList = this.k;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectC = this.i.c();
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectC.get(next));
            }
            if (!TextUtils.isEmpty(this.f)) {
                jSONObject.put("$og_title", this.f);
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("$canonical_identifier", this.d);
            }
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("$canonical_url", this.e);
            }
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("$keywords", jSONArray);
            }
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("$og_description", this.g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put("$og_image_url", this.h);
            }
            long j = this.l;
            if (j > 0) {
                jSONObject.put("$exp_date", j);
            }
            CONTENT_INDEX_MODE content_index_mode = this.j;
            CONTENT_INDEX_MODE content_index_mode2 = CONTENT_INDEX_MODE.d;
            jSONObject.put("$publicly_indexable", content_index_mode == content_index_mode2);
            jSONObject.put("$locally_indexable", this.m == content_index_mode2);
            jSONObject.put("$creation_timestamp", this.n);
            return jSONObject;
        } catch (JSONException e) {
            BranchLogger.a(e.getMessage());
            return jSONObject;
        }
    }

    public final void b(Context context, LinkProperties linkProperties, a aVar) throws JSONException {
        HashMap map = linkProperties.i;
        String str = linkProperties.f;
        ArrayList arrayList = linkProperties.d;
        boolean zB = PrefHelper.d(context).b("bnc_tracking_state");
        CONTENT_INDEX_MODE content_index_mode = CONTENT_INDEX_MODE.d;
        ArrayList arrayList2 = this.k;
        if (zB) {
            BranchShortLinkBuilder branchShortLinkBuilder = new BranchShortLinkBuilder(context);
            if (arrayList != null) {
                branchShortLinkBuilder.b(arrayList);
            }
            String str2 = linkProperties.e;
            if (str2 != null) {
                branchShortLinkBuilder.i(str2);
            }
            if (str != null) {
                branchShortLinkBuilder.e(str);
            }
            String str3 = linkProperties.j;
            if (str3 != null) {
                branchShortLinkBuilder.g(str3);
            }
            String str4 = linkProperties.g;
            if (str4 != null) {
                branchShortLinkBuilder.j(str4);
            }
            String str5 = linkProperties.k;
            if (str5 != null) {
                branchShortLinkBuilder.f(str5);
            }
            int i = linkProperties.h;
            if (i > 0) {
                branchShortLinkBuilder.h(i);
            }
            if (!TextUtils.isEmpty(this.f)) {
                branchShortLinkBuilder.a(this.f, "$og_title");
            }
            if (!TextUtils.isEmpty(this.d)) {
                branchShortLinkBuilder.a(this.d, "$canonical_identifier");
            }
            if (!TextUtils.isEmpty(this.e)) {
                branchShortLinkBuilder.a(this.e, "$canonical_url");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            if (jSONArray.length() > 0) {
                branchShortLinkBuilder.a(jSONArray, "$keywords");
            }
            if (!TextUtils.isEmpty(this.g)) {
                branchShortLinkBuilder.a(this.g, "$og_description");
            }
            if (!TextUtils.isEmpty(this.h)) {
                branchShortLinkBuilder.a(this.h, "$og_image_url");
            }
            if (this.l > 0) {
                branchShortLinkBuilder.a("" + this.l, "$exp_date");
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(this.j == content_index_mode);
            branchShortLinkBuilder.a(sb.toString(), "$publicly_indexable");
            JSONObject jSONObjectC = this.i.c();
            try {
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    branchShortLinkBuilder.a(jSONObjectC.get(next), next);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            for (String str6 : map.keySet()) {
                branchShortLinkBuilder.a(map.get(str6), str6);
            }
            aVar.e(branchShortLinkBuilder.d(), null);
            return;
        }
        BranchShortLinkBuilder branchShortLinkBuilder2 = new BranchShortLinkBuilder(context);
        if (arrayList != null) {
            branchShortLinkBuilder2.b(arrayList);
        }
        String str7 = linkProperties.e;
        if (str7 != null) {
            branchShortLinkBuilder2.i(str7);
        }
        if (str != null) {
            branchShortLinkBuilder2.e(str);
        }
        String str8 = linkProperties.j;
        if (str8 != null) {
            branchShortLinkBuilder2.g(str8);
        }
        String str9 = linkProperties.g;
        if (str9 != null) {
            branchShortLinkBuilder2.j(str9);
        }
        String str10 = linkProperties.k;
        if (str10 != null) {
            branchShortLinkBuilder2.f(str10);
        }
        int i2 = linkProperties.h;
        if (i2 > 0) {
            branchShortLinkBuilder2.h(i2);
        }
        if (!TextUtils.isEmpty(this.f)) {
            branchShortLinkBuilder2.a(this.f, "$og_title");
        }
        if (!TextUtils.isEmpty(this.d)) {
            branchShortLinkBuilder2.a(this.d, "$canonical_identifier");
        }
        if (!TextUtils.isEmpty(this.e)) {
            branchShortLinkBuilder2.a(this.e, "$canonical_url");
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        if (jSONArray2.length() > 0) {
            branchShortLinkBuilder2.a(jSONArray2, "$keywords");
        }
        if (!TextUtils.isEmpty(this.g)) {
            branchShortLinkBuilder2.a(this.g, "$og_description");
        }
        if (!TextUtils.isEmpty(this.h)) {
            branchShortLinkBuilder2.a(this.h, "$og_image_url");
        }
        if (this.l > 0) {
            branchShortLinkBuilder2.a("" + this.l, "$exp_date");
        }
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(this.j == content_index_mode);
        branchShortLinkBuilder2.a(sb2.toString(), "$publicly_indexable");
        JSONObject jSONObjectC2 = this.i.c();
        try {
            Iterator<String> itKeys2 = jSONObjectC2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                branchShortLinkBuilder2.a(jSONObjectC2.get(next2), next2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        for (String str11 : map.keySet()) {
            branchShortLinkBuilder2.a(map.get(str11), str11);
        }
        branchShortLinkBuilder2.c(aVar);
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(String str) {
        this.g = str;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final void g(ContentMetadata contentMetadata) {
        this.i = contentMetadata;
    }

    public final void h(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.n);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.l);
        parcel.writeInt(this.j.ordinal());
        parcel.writeSerializable(this.k);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.m.ordinal());
    }
}
