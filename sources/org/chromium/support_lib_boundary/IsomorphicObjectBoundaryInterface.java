package org.chromium.support_lib_boundary;

import java.util.concurrent.Callable;
import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes8.dex */
public interface IsomorphicObjectBoundaryInterface {
    Object getOrCreatePeer(Callable<Object> callable);
}
