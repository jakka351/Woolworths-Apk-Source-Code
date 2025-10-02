package coil3.decode;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil3/decode/ExifOrientationStrategy;", "", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ExifOrientationStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13078a;
    public static final b b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcoil3/decode/ExifOrientationStrategy$Companion;", "", "Lcoil3/decode/ExifOrientationStrategy;", "IGNORE", "Lcoil3/decode/ExifOrientationStrategy;", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [coil3.decode.b] */
    /* JADX WARN: Type inference failed for: r0v1, types: [coil3.decode.b] */
    static {
        final int i = 0;
        f13078a = new ExifOrientationStrategy() { // from class: coil3.decode.b
            @Override // coil3.decode.ExifOrientationStrategy
            public final boolean a(String str) {
                switch (i) {
                    case 0:
                        return str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"));
                    default:
                        return true;
                }
            }
        };
        final int i2 = 1;
        b = new ExifOrientationStrategy() { // from class: coil3.decode.b
            @Override // coil3.decode.ExifOrientationStrategy
            public final boolean a(String str) {
                switch (i2) {
                    case 0:
                        return str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"));
                    default:
                        return true;
                }
            }
        };
    }

    boolean a(String str);
}
