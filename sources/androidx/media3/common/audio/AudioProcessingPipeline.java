package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class AudioProcessingPipeline {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableList f2892a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public AudioProcessingPipeline(ImmutableList immutableList) {
        this.f2892a = immutableList;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f2892a;
            if (i >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((AudioProcessor) arrayList.get(i2)).e();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((AudioProcessor) this.b.get(b())).b() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i);
                    if (!audioProcessor.b()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f2893a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.c(byteBuffer2);
                        this.c[i] = audioProcessor.e();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((AudioProcessor) arrayList.get(i + 1)).d();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        ImmutableList immutableList = ((AudioProcessingPipeline) obj).f2892a;
        ImmutableList immutableList2 = this.f2892a;
        if (immutableList2.size() != immutableList.size()) {
            return false;
        }
        for (int i = 0; i < immutableList2.size(); i++) {
            if (immutableList2.get(i) != immutableList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2892a.hashCode();
    }
}
