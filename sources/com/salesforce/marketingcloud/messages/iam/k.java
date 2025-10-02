package com.salesforce.marketingcloud.messages.iam;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.util.Date;

/* loaded from: classes6.dex */
class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();
    private static final String g = com.salesforce.marketingcloud.g.a("MessageHandler");

    /* renamed from: a, reason: collision with root package name */
    private final InAppMessage f17008a;
    private i b;
    private long c;
    private long d;
    private long e;
    private boolean f;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    public k(Parcel parcel) {
        this((InAppMessage) parcel.readParcelable(InAppMessage.class.getClassLoader()));
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = parcel.readInt() == 1;
    }

    private void h() {
        if (this.f) {
            this.d = (SystemClock.elapsedRealtime() - this.e) + this.d;
        }
    }

    public boolean a() {
        i iVar;
        InAppMessage inAppMessage = this.f17008a;
        return (inAppMessage == null || (iVar = this.b) == null || !iVar.canDisplay(inAppMessage)) ? false : true;
    }

    public long b() {
        return this.d;
    }

    public Date c() {
        return new Date(this.c);
    }

    public InAppMessage d() {
        return this.f17008a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public o e() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.imageHandler();
        }
        return null;
    }

    public void f() {
        h();
    }

    public void g() {
        if (this.c == -1) {
            this.c = System.currentTimeMillis();
        }
        this.e = SystemClock.elapsedRealtime();
    }

    public int i() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.getStatusBarColor();
        }
        return 0;
    }

    public void j() {
        h();
        this.f = false;
    }

    @Nullable
    public Typeface k() {
        i iVar = this.b;
        if (iVar != null) {
            return iVar.getTypeface();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f17008a, i);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public k(@NonNull InAppMessage inAppMessage) {
        MarketingCloudSdk marketingCloudSdk;
        this.c = -1L;
        this.f = true;
        this.f17008a = inAppMessage;
        if ((MarketingCloudSdk.isInitializing() || MarketingCloudSdk.isReady()) && (marketingCloudSdk = MarketingCloudSdk.getInstance()) != null) {
            this.b = (i) marketingCloudSdk.getInAppMessageManager();
        }
    }

    public void a(@NonNull j jVar) {
        i iVar = this.b;
        if (iVar != null) {
            InAppMessage inAppMessage = this.f17008a;
            if (jVar == null) {
                jVar = j.e();
            }
            iVar.handleMessageFinished(inAppMessage, jVar);
        }
    }

    @Nullable
    public PendingIntent a(@NonNull Context context, @NonNull InAppMessage.Button button) {
        UrlHandler urlHandler;
        String strAction = button.action();
        if (button.actionType() != InAppMessage.Button.ActionType.url || strAction == null || (urlHandler = this.b.urlHandler()) == null) {
            return null;
        }
        try {
            return urlHandler.handleUrl(context, strAction, UrlHandler.ACTION);
        } catch (Exception e) {
            com.salesforce.marketingcloud.g.b(g, e, "Exception thrown by %s while handling url", urlHandler.getClass().getName());
            return null;
        }
    }
}
