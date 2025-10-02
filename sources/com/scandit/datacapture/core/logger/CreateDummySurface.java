package com.scandit.datacapture.core.logger;

import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b \u0010!J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003JA\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/core/logger/CreateDummySurface;", "Lcom/scandit/datacapture/core/logger/Event;", "", "component1", "component2", "", "component3", "component4", "eglVendor", "eglVersion", "eglClientApis", "eglExtensions", "copy", "toString", "", "hashCode", "", "other", "", "equals", "b", "Ljava/lang/String;", "getEglVendor", "()Ljava/lang/String;", "c", "getEglVersion", "d", "Ljava/util/List;", "getEglClientApis", "()Ljava/util/List;", "e", "getEglExtensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final /* data */ class CreateDummySurface extends Event {

    /* renamed from: b, reason: from kotlin metadata */
    private final String eglVendor;

    /* renamed from: c, reason: from kotlin metadata */
    private final String eglVersion;

    /* renamed from: d, reason: from kotlin metadata */
    private final List eglClientApis;

    /* renamed from: e, reason: from kotlin metadata */
    private final List eglExtensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDummySurface(@Nullable String str, @Nullable String str2, @NotNull List<String> eglClientApis, @NotNull List<String> eglExtensions) {
        super(null);
        Intrinsics.h(eglClientApis, "eglClientApis");
        Intrinsics.h(eglExtensions, "eglExtensions");
        this.eglVendor = str;
        this.eglVersion = str2;
        this.eglClientApis = eglClientApis;
        this.eglExtensions = eglExtensions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateDummySurface copy$default(CreateDummySurface createDummySurface, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createDummySurface.eglVendor;
        }
        if ((i & 2) != 0) {
            str2 = createDummySurface.eglVersion;
        }
        if ((i & 4) != 0) {
            list = createDummySurface.eglClientApis;
        }
        if ((i & 8) != 0) {
            list2 = createDummySurface.eglExtensions;
        }
        return createDummySurface.copy(str, str2, list, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getEglVendor() {
        return this.eglVendor;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEglVersion() {
        return this.eglVersion;
    }

    @NotNull
    public final List<String> component3() {
        return this.eglClientApis;
    }

    @NotNull
    public final List<String> component4() {
        return this.eglExtensions;
    }

    @NotNull
    public final CreateDummySurface copy(@Nullable String eglVendor, @Nullable String eglVersion, @NotNull List<String> eglClientApis, @NotNull List<String> eglExtensions) {
        Intrinsics.h(eglClientApis, "eglClientApis");
        Intrinsics.h(eglExtensions, "eglExtensions");
        return new CreateDummySurface(eglVendor, eglVersion, eglClientApis, eglExtensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateDummySurface)) {
            return false;
        }
        CreateDummySurface createDummySurface = (CreateDummySurface) other;
        return Intrinsics.c(this.eglVendor, createDummySurface.eglVendor) && Intrinsics.c(this.eglVersion, createDummySurface.eglVersion) && Intrinsics.c(this.eglClientApis, createDummySurface.eglClientApis) && Intrinsics.c(this.eglExtensions, createDummySurface.eglExtensions);
    }

    @NotNull
    public final List<String> getEglClientApis() {
        return this.eglClientApis;
    }

    @NotNull
    public final List<String> getEglExtensions() {
        return this.eglExtensions;
    }

    @Nullable
    public final String getEglVendor() {
        return this.eglVendor;
    }

    @Nullable
    public final String getEglVersion() {
        return this.eglVersion;
    }

    public int hashCode() {
        String str = this.eglVendor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eglVersion;
        return this.eglExtensions.hashCode() + b.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.eglClientApis);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CreateDummySurface(eglVendor=");
        sb.append(this.eglVendor);
        sb.append(", eglVersion=");
        sb.append(this.eglVersion);
        sb.append(", eglClientApis=");
        sb.append(this.eglClientApis);
        sb.append(", eglExtensions=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.eglExtensions, ')');
    }
}
