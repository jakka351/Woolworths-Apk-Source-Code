package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MetadataVersion extends BinaryVersion {
    public static final MetadataVersion g;
    public static final MetadataVersion h;
    public final boolean f;

    public static final class Companion {
    }

    static {
        MetadataVersion metadataVersion = new MetadataVersion(new int[]{2, 1, 0}, false);
        g = metadataVersion;
        int i = metadataVersion.c;
        int i2 = metadataVersion.b;
        h = (i2 == 1 && i == 9) ? new MetadataVersion(new int[]{2, 0, 0}, false) : new MetadataVersion(new int[]{i2, i + 1, 0}, false);
        new MetadataVersion(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.h(versionArray, "versionArray");
        this.f = z;
    }

    public final boolean b(MetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.h(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        MetadataVersion metadataVersion = this.f ? g : h;
        int i = metadataVersion.b;
        int i2 = metadataVersionFromLanguageVersion.b;
        if (i > i2 || (i >= i2 && metadataVersion.c > metadataVersionFromLanguageVersion.c)) {
            metadataVersionFromLanguageVersion = metadataVersion;
        }
        int i3 = this.c;
        boolean z = false;
        int i4 = this.b;
        if ((i4 == 1 && i3 == 0) || i4 == 0) {
            return false;
        }
        int i5 = metadataVersionFromLanguageVersion.b;
        if (i4 > i5 || (i4 >= i5 && i3 > metadataVersionFromLanguageVersion.c)) {
            z = true;
        }
        return !z;
    }
}
