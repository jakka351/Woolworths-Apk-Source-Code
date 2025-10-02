package org.tensorflow.lite.support.image;

import org.tensorflow.lite.support.image.ImageProperties;

/* loaded from: classes8.dex */
final class AutoValue_ImageProperties extends ImageProperties {

    public static final class Builder extends ImageProperties.Builder {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ImageProperties{height=0, width=0, colorSpaceType=null}";
    }
}
