package androidx.camera.video.internal.encoder;

/* loaded from: classes2.dex */
public interface EncoderCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final EncoderCallback f624a = new AnonymousClass1();

    /* renamed from: androidx.camera.video.internal.encoder.EncoderCallback$1, reason: invalid class name */
    public class AnonymousClass1 implements EncoderCallback {
        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void a(EncodeException encodeException) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void b(androidx.camera.core.internal.a aVar) {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void c() {
        }

        @Override // androidx.camera.video.internal.encoder.EncoderCallback
        public final void d(EncodedData encodedData) {
        }
    }

    void a(EncodeException encodeException);

    void b(androidx.camera.core.internal.a aVar);

    void c();

    void d(EncodedData encodedData);
}
