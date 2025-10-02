package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;

/* loaded from: classes6.dex */
public final class zzk {
    public static zzajb a(AuthCredential authCredential, String str) {
        Preconditions.checkNotNull(authCredential);
        if (authCredential instanceof GoogleAuthCredential) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            Preconditions.checkNotNull(googleAuthCredential);
            return new zzajb(googleAuthCredential.d, googleAuthCredential.e, "google.com", null, null, null, str, null, null);
        }
        if (authCredential instanceof FacebookAuthCredential) {
            FacebookAuthCredential facebookAuthCredential = (FacebookAuthCredential) authCredential;
            Preconditions.checkNotNull(facebookAuthCredential);
            return new zzajb(null, facebookAuthCredential.d, "facebook.com", null, null, null, str, null, null);
        }
        if (authCredential instanceof TwitterAuthCredential) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            Preconditions.checkNotNull(twitterAuthCredential);
            return new zzajb(null, twitterAuthCredential.d, "twitter.com", null, twitterAuthCredential.e, null, str, null, null);
        }
        if (authCredential instanceof GithubAuthCredential) {
            GithubAuthCredential githubAuthCredential = (GithubAuthCredential) authCredential;
            Preconditions.checkNotNull(githubAuthCredential);
            return new zzajb(null, githubAuthCredential.d, "github.com", null, null, null, str, null, null);
        }
        if (authCredential instanceof PlayGamesAuthCredential) {
            PlayGamesAuthCredential playGamesAuthCredential = (PlayGamesAuthCredential) authCredential;
            Preconditions.checkNotNull(playGamesAuthCredential);
            return new zzajb(null, null, "playgames.google.com", null, null, playGamesAuthCredential.d, str, null, null);
        }
        if (!(authCredential instanceof com.google.firebase.auth.zze)) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        com.google.firebase.auth.zze zzeVar = (com.google.firebase.auth.zze) authCredential;
        Preconditions.checkNotNull(zzeVar);
        zzajb zzajbVar = zzeVar.g;
        return zzajbVar != null ? zzajbVar : new zzajb(zzeVar.e, zzeVar.f, zzeVar.d, null, zzeVar.i, null, str, zzeVar.h, zzeVar.j);
    }
}
