package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Builder", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
public final class IntentSenderRequest implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new IntentSenderRequest$Companion$CREATOR$1();
    public final IntentSender d;
    public final Intent e;
    public final int f;
    public final int g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "Flag", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final IntentSender f81a;
        public Intent b;
        public int c;
        public int d;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder$Flag;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            Intrinsics.h(intentSender, "intentSender");
            this.f81a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f81a, this.b, this.c, this.d);
        }

        public final void b(Intent intent) {
            this.b = intent;
        }

        public final void c(int i, int i2) {
            this.d = i;
            this.c = i2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(PendingIntent pendingIntent) {
            Intrinsics.h(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.g(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.h(intentSender, "intentSender");
        this.d = intentSender;
        this.e = intent;
        this.f = i;
        this.g = i2;
    }

    /* renamed from: a, reason: from getter */
    public final Intent getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* renamed from: d, reason: from getter */
    public final IntentSender getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f);
        dest.writeInt(this.g);
    }
}
