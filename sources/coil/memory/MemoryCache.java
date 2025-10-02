package coil.memory;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import coil.util.Utils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcoil/memory/MemoryCache;", "", "Builder", "Key", "Value", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MemoryCache {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil/memory/MemoryCache$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13001a;
        public final double b;
        public final boolean c;
        public final boolean d;

        public Builder(@NotNull Context context) {
            this.f13001a = context;
            Bitmap.Config[] configArr = Utils.f13033a;
            double d = 0.2d;
            try {
                Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                Intrinsics.e(systemService);
                if (((ActivityManager) systemService).isLowRamDevice()) {
                    d = 0.15d;
                }
            } catch (Exception unused) {
            }
            this.b = d;
            this.c = true;
            this.d = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Key implements Parcelable {

        @JvmField
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new MemoryCache$Key$Companion$CREATOR$1();
        public final String d;
        public final Map e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil/memory/MemoryCache$Key$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "CREATOR", "Landroid/os/Parcelable$Creator;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
        }

        public Key(String str, Map map) {
            this.d = str;
            this.e = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.c(this.d, key.d) && Intrinsics.c(this.e, key.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(key=");
            sb.append(this.d);
            sb.append(", extras=");
            return a.u(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
            Map map = this.e;
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                parcel.writeString(str);
                parcel.writeString(str2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Value;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Value {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f13002a;
        public final Map b;

        public Value(Bitmap bitmap, Map map) {
            this.f13002a = bitmap;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.c(this.f13002a, value.f13002a) && Intrinsics.c(this.b, value.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f13002a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Value(bitmap=");
            sb.append(this.f13002a);
            sb.append(", extras=");
            return a.u(sb, this.b, ')');
        }
    }

    void a(int i);

    Value b(Key key);

    void c(Key key, Value value);
}
