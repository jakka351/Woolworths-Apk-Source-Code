package okhttp3;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import okio.Buffer;
import okio.BufferedSink;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FormBody extends RequestBody {
    public static final MediaType d;
    public final List b;
    public final List c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f26680a;
        public final ArrayList b;

        @JvmOverloads
        public Builder() {
            this(0);
        }

        public final void a(String name, String value) {
            Intrinsics.h(name, "name");
            Intrinsics.h(value, "value");
            this.f26680a.add(_UrlKt.b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
            this.b.add(_UrlKt.b(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        }

        public final void b(String name, String str) {
            Intrinsics.h(name, "name");
            this.f26680a.add(_UrlKt.b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            this.b.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        }

        public final FormBody c() {
            return new FormBody(this.f26680a, this.b);
        }

        public Builder(int i) {
            this.f26680a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "<init>", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        MediaType.e.getClass();
        d = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.h(encodedNames, "encodedNames");
        Intrinsics.h(encodedValues, "encodedValues");
        this.b = _UtilJvmKt.j(encodedNames);
        this.c = _UtilJvmKt.j(encodedValues);
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return e(null, true);
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getD() {
        return d;
    }

    @Override // okhttp3.RequestBody
    public final void d(BufferedSink bufferedSink) {
        e(bufferedSink, false);
    }

    public final long e(BufferedSink bufferedSink, boolean z) {
        Buffer e;
        if (z) {
            e = new Buffer();
        } else {
            Intrinsics.e(bufferedSink);
            e = bufferedSink.getE();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                e.Y(38);
            }
            e.t0((String) list.get(i));
            e.Y(61);
            e.t0((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = e.e;
        e.a();
        return j;
    }
}
