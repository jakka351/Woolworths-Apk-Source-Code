package org.tensorflow.lite.support.image.ops;

import org.tensorflow.lite.support.image.ImageOperator;

/* loaded from: classes8.dex */
public class ResizeOp implements ImageOperator {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResizeMethod {
        public static final /* synthetic */ ResizeMethod[] d = {new ResizeMethod("BILINEAR", 0), new ResizeMethod("NEAREST_NEIGHBOR", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ResizeMethod EF5;

        public static ResizeMethod valueOf(String str) {
            return (ResizeMethod) Enum.valueOf(ResizeMethod.class, str);
        }

        public static ResizeMethod[] values() {
            return (ResizeMethod[]) d.clone();
        }
    }
}
