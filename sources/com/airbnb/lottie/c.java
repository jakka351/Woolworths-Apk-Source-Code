package com.airbnb.lottie;

import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements LottieListener {
    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        c cVar = LottieAnimationView.t;
        ThreadLocal threadLocal = Utils.f13480a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        Logger.c("Unable to load composition.", th);
    }
}
