package com.auth0.android.provider;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CustomTabsOptions implements Parcelable {
    public static final Parcelable.Creator<CustomTabsOptions> CREATOR = new AnonymousClass1();
    public final boolean d;
    public final int e;
    public final BrowserPicker f;

    /* renamed from: com.auth0.android.provider.CustomTabsOptions$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<CustomTabsOptions> {
        @Override // android.os.Parcelable.Creator
        public final CustomTabsOptions createFromParcel(Parcel parcel) {
            return new CustomTabsOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CustomTabsOptions[] newArray(int i) {
            return new CustomTabsOptions[i];
        }
    }

    public static class Builder {
    }

    public CustomTabsOptions(BrowserPicker browserPicker) {
        this.d = false;
        this.e = 0;
        this.f = browserPicker;
    }

    public final String a(PackageManager packageManager) {
        ArrayList arrayList = this.f.d;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z = arrayList != null;
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (!z || arrayList.contains(resolveInfo.activityInfo.packageName)) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList3.add(resolveInfo.activityInfo.packageName);
                } else {
                    arrayList2.add(resolveInfo.activityInfo.packageName);
                }
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(str);
            }
            arrayList.addAll(BrowserPicker.e);
        }
        String strA = BrowserPicker.a(str, arrayList3, arrayList);
        return strA != null ? strA : BrowserPicker.a(str, arrayList2, arrayList);
    }

    public final TrustedWebActivityIntentBuilder b(Context context, Uri uri) {
        TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder = new TrustedWebActivityIntentBuilder(uri);
        int i = this.e;
        if (i > 0) {
            CustomTabColorSchemeParams.Builder builder = new CustomTabColorSchemeParams.Builder();
            builder.b(context.getColor(i));
            trustedWebActivityIntentBuilder.d(builder.a());
        }
        return trustedWebActivityIntentBuilder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
    }

    public CustomTabsOptions(Parcel parcel) {
        this.d = parcel.readByte() != 0;
        this.e = parcel.readInt();
        this.f = (BrowserPicker) parcel.readParcelable(BrowserPicker.class.getClassLoader());
    }
}
