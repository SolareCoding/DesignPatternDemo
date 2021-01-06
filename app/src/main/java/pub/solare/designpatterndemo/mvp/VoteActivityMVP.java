package pub.solare.designpatterndemo.mvp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pub.solare.designpatterndemo.R;

public class VoteActivityMVP extends AppCompatActivity implements IVoteContract.IVoteView {

    private TextView mCount, mTitle;
    private Button mVoteBtn;
    private IVoteContract.IVotePresenter mVotePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mVotePresenter = new VotePresenter(this);

    }

    private void initView() {
        mCount = findViewById(R.id.voteCount);
        mTitle = findViewById(R.id.voteTitle);
        mVoteBtn = findViewById(R.id.button);
        mCount.setText("0");
        mTitle.setText("MVP Please vote me!");
        mVoteBtn.setText("Vote");
        mVoteBtn.setOnClickListener(view->onVote());
    }

    private void onVote() {
        if (mVotePresenter != null) mVotePresenter.vote();
    }

    @Override
    public void onVoteResult() {
        Log.v("Solare", "onVoteResult");
        mCount.setText("1");
    }
}