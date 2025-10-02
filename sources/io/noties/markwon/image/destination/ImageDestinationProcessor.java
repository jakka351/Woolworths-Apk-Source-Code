package io.noties.markwon.image.destination;

/* loaded from: classes7.dex */
public abstract class ImageDestinationProcessor {

    public static class NoOp extends ImageDestinationProcessor {
        @Override // io.noties.markwon.image.destination.ImageDestinationProcessor
        public final String b(String str) {
            return str;
        }
    }

    public static ImageDestinationProcessor a() {
        return new NoOp();
    }

    public abstract String b(String str);
}
