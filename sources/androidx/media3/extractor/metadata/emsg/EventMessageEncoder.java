package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.util.UnstableApi;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

@UnstableApi
/* loaded from: classes2.dex */
public final class EventMessageEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f3283a;
    public final DataOutputStream b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f3283a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }
}
