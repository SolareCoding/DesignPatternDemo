package pub.solare.designpatterndemo.mvp;

public class VoteModel implements IVoteContract.IVoteModel {

    private IVoteContract.IVotePresenterCallback mVotePresenterCallback;

    public VoteModel(IVoteContract.IVotePresenterCallback votePresenterCallback) {
         mVotePresenterCallback = votePresenterCallback;
    }

    @Override
    public void vote() {
        // Write to database, or make a http request
        boolean writeSuccess = true;
        if (writeSuccess) {
            if (mVotePresenterCallback != null) mVotePresenterCallback.onVoteResult();
        }
    }
}
