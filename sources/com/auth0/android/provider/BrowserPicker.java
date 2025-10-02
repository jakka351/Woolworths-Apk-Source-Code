package com.auth0.android.provider;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BrowserPicker implements Parcelable {
    public final ArrayList d;
    public static final List e = Arrays.asList("com.android.chrome", "com.google.android.apps.chrome", "com.android.chrome.beta", "com.android.chrome.dev");
    public static final Parcelable.Creator<BrowserPicker> CREATOR = new AnonymousClass1();

    /* renamed from: com.auth0.android.provider.BrowserPicker$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<BrowserPicker> {
        @Override // android.os.Parcelable.Creator
        public final BrowserPicker createFromParcel(Parcel parcel) {
            return new BrowserPicker(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BrowserPicker[] newArray(int i) {
            return new BrowserPicker[i];
        }
    }

    public static class Builder {
    }

    public BrowserPicker() {
        this.d = null;
    }

    public static String a(String str, ArrayList arrayList, List list) {
        if (str != null && list.contains(str) && arrayList.contains(str)) {
            return str;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (arrayList.contains(str2)) {
                return str2;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.d);
    }

    public BrowserPicker(Parcel parcel) {
        this.d = parcel.createStringArrayList();
    }
}
