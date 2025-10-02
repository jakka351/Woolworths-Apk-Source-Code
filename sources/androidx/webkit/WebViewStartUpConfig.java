package androidx.webkit;

import androidx.webkit.WebViewCompat;
import java.util.concurrent.Executor;

@WebViewCompat.ExperimentalAsyncStartUp
/* loaded from: classes2.dex */
public final class WebViewStartUpConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3843a;
    public final boolean b;

    @WebViewCompat.ExperimentalAsyncStartUp
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Executor f3844a;
        public boolean b = true;

        public Builder(Executor executor) {
            this.f3844a = executor;
        }

        public final WebViewStartUpConfig a() {
            return new WebViewStartUpConfig(this.f3844a, this.b);
        }

        public final void b(boolean z) {
            this.b = z;
        }
    }

    public WebViewStartUpConfig(Executor executor, boolean z) {
        this.f3843a = executor;
        this.b = z;
    }
}
