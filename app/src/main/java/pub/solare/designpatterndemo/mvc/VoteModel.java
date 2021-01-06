package pub.solare.designpatterndemo.mvc;

import android.util.Log;

import pub.solare.designpatterndemo.Utils;

public class VoteModel implements IVoteModel {

    private IVoteView mVoteView;

    public VoteModel() {
        mVoteView = Utils.getInstance().getVoteView();
    }

    public void vote() {
        // Write to database, or make a http request
        boolean writeSuccess = true;
        if (writeSuccess) {
            if (mVoteView != null) mVoteView.onVoteResult();
            Log.v("Solare", "writeSuccess");
        }
    }
}
