package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.MultiBlockCipher;

/* loaded from: classes8.dex */
public interface CBCModeCipher extends MultiBlockCipher {
    BlockCipher getUnderlyingCipher();
}
