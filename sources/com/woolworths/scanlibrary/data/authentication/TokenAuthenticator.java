package com.woolworths.scanlibrary.data.authentication;

import android.os.ConditionVariable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.medallia.digital.mobilesdk.l8;
import com.woolworths.scanlibrary.data.authentication.token.DefaultTokenProvider;
import com.woolworths.scanlibrary.models.authentication.Token;
import io.reactivex.internal.observers.BlockingFirstObserver;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/authentication/TokenAuthenticator;", "Lokhttp3/Authenticator;", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenAuthenticator implements Authenticator {
    public final DefaultTokenProvider b;
    public Token e;
    public final ConditionVariable c = new ConditionVariable(true);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final String f = "/scan/go/v2/login/rewards";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/data/authentication/TokenAuthenticator$Companion;", "", "", "WAIT_TIMEOUT_MSEC", "J", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public TokenAuthenticator(DefaultTokenProvider defaultTokenProvider) {
        this.b = defaultTokenProvider;
    }

    @Override // okhttp3.Authenticator
    public final Request a(Route route, Response response) {
        BlockingFirstObserver blockingFirstObserver;
        Throwable th;
        Request request = response.d;
        Headers headers = request.c;
        headers.getClass();
        StringsKt.z();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(headers.d(i));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.g(setUnmodifiableSet, "unmodifiableSet(...)");
        if (setUnmodifiableSet.contains("authorization") && !StringsKt.W(request.f26690a.b(), this.f, true)) {
            AtomicBoolean atomicBoolean = this.d;
            boolean zCompareAndSet = atomicBoolean.compareAndSet(false, true);
            ConditionVariable conditionVariable = this.c;
            if (zCompareAndSet) {
                conditionVariable.close();
                this.e = null;
                try {
                    ObservableOnErrorNext observableOnErrorNextA = this.b.a();
                    blockingFirstObserver = new BlockingFirstObserver(1);
                    observableOnErrorNextA.a(blockingFirstObserver);
                    if (blockingFirstObserver.getCount() != 0) {
                        try {
                            blockingFirstObserver.await();
                        } catch (InterruptedException e) {
                            blockingFirstObserver.dispose();
                            throw ExceptionHelper.d(e);
                        }
                    }
                    th = blockingFirstObserver.e;
                } catch (Throwable unused) {
                }
                if (th != null) {
                    throw ExceptionHelper.d(th);
                }
                Object obj = blockingFirstObserver.d;
                if (obj == null) {
                    throw new NoSuchElementException();
                }
                this.e = (Token) obj;
                conditionVariable.open();
                atomicBoolean.set(false);
            } else {
                conditionVariable.block(l8.b.b);
            }
            Token token = this.e;
            if (token != null) {
                Request.Builder builderB = request.b();
                builderB.c("authorization", " Bearer " + token.getAccessToken());
                return new Request(builderB);
            }
        }
        return null;
    }
}
