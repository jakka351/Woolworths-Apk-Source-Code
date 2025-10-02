package au.com.woolworths.sdui.common;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/sdui/common/IconAsset;", "Landroid/os/Parcelable;", "HostedIcon", "CoreIcon", "Companion", "Lau/com/woolworths/sdui/common/IconAsset$CoreIcon;", "Lau/com/woolworths/sdui/common/IconAsset$HostedIcon;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public interface IconAsset extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9986a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/common/IconAsset$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/common/IconAsset;", "serializer", "()Lkotlinx/serialization/KSerializer;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9986a = new Companion();

        @NotNull
        public final KSerializer<IconAsset> serializer() {
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            return new SealedClassSerializer("au.com.woolworths.sdui.common.IconAsset", reflectionFactory.b(IconAsset.class), new KClass[]{reflectionFactory.b(CoreIcon.class), reflectionFactory.b(HostedIcon.class)}, new KSerializer[]{IconAsset$CoreIcon$$serializer.f9984a, IconAsset$HostedIcon$$serializer.f9985a}, new Annotation[0]);
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/sdui/common/IconAsset$CoreIcon;", "Lau/com/woolworths/sdui/common/IconAsset;", "Landroid/os/Parcelable;", "Companion", "$serializer", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CoreIcon implements IconAsset, Parcelable {
        public final String d;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<CoreIcon> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/common/IconAsset$CoreIcon$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/common/IconAsset$CoreIcon;", "serializer", "()Lkotlinx/serialization/KSerializer;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            @NotNull
            public final KSerializer<CoreIcon> serializer() {
                return IconAsset$CoreIcon$$serializer.f9984a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<CoreIcon> {
            @Override // android.os.Parcelable.Creator
            public final CoreIcon createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new CoreIcon(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CoreIcon[] newArray(int i) {
                return new CoreIcon[i];
            }
        }

        public /* synthetic */ CoreIcon(int i, String str) {
            if (1 == (i & 1)) {
                this.d = str;
            } else {
                PluginExceptionsKt.a(i, 1, IconAsset$CoreIcon$$serializer.f9984a.getDescriptor());
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CoreIcon) && Intrinsics.c(this.d, ((CoreIcon) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("CoreIcon(name=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }

        public CoreIcon(String name) {
            Intrinsics.h(name, "name");
            this.d = name;
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/sdui/common/IconAsset$HostedIcon;", "Lau/com/woolworths/sdui/common/IconAsset;", "Landroid/os/Parcelable;", "Companion", "$serializer", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class HostedIcon implements IconAsset, Parcelable {
        public final String d;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<HostedIcon> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/common/IconAsset$HostedIcon$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/common/IconAsset$HostedIcon;", "serializer", "()Lkotlinx/serialization/KSerializer;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<HostedIcon> serializer() {
                return IconAsset$HostedIcon$$serializer.f9985a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<HostedIcon> {
            @Override // android.os.Parcelable.Creator
            public final HostedIcon createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new HostedIcon(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HostedIcon[] newArray(int i) {
                return new HostedIcon[i];
            }
        }

        public /* synthetic */ HostedIcon(int i, String str) {
            if (1 == (i & 1)) {
                this.d = str;
            } else {
                PluginExceptionsKt.a(i, 1, IconAsset$HostedIcon$$serializer.f9985a.getDescriptor());
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedIcon) && Intrinsics.c(this.d, ((HostedIcon) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return a.h("HostedIcon(url=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }

        public HostedIcon(String url) {
            Intrinsics.h(url, "url");
            this.d = url;
        }
    }
}
