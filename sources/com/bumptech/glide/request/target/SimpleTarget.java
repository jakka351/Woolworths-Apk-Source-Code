package com.bumptech.glide.request.target;

import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Util;

@Deprecated
/* loaded from: classes4.dex */
public abstract class SimpleTarget<Z> extends BaseTarget<Z> {
    @Override // com.bumptech.glide.request.target.Target
    public final void b(SingleRequest singleRequest) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(SingleRequest singleRequest) {
        if (!Util.j(0, 0)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: 0 and height: 0, either provide dimensions in the constructor or call override()");
        }
        singleRequest.b(0, 0);
    }
}
