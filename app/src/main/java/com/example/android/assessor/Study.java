package com.example.android.assessor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Study extends AppCompatActivity {
    int i=0;
    TextView tv1,tv2;
    ScrollView scrollView;
    Button btn;
    String n;
    String question[]={
            "Tell Me About Yourself...",
            "What Is Your Greatest Strength?",
            "What Is Your Greatest Weakness?",
            "Why Do You Want To Work For Us?",
            "Why Did You Leave Your Last Job?",
            "What Is Your Greatest Accomplishment?",
            "Describe A Difficult Work Situation And What You Did To Overcome It...",
            "Where Do You See Yourself In 5 Years?",
            "Do You Have Any Questions For Me?",
            "Why Should We Hire You?"

    };
    String answer[]={"DO:\n" +
            "•\tKeep your answer succinct and to the point.\n" +
            "•\tBe work specific and tell the hiring manager about where you are now professionally, what you have learned from your past work experiences and then talk about what makes you excited about this specific opportunity.\n" +
            "•\tDo your company research and find out exactly what strengths and qualities this specific company is looking for and in your answer try and show the hiring manager you possess them (You can discover these strengths or qualities in the job description or on their website.)\n" +
            "\nDON’T:\n" +
            "•\tDon’t dive into your life story.\n" +
            "•\tThe hiring manager doesn’t want to hear about you “growing up on 28th avenue down the road from the Trader Joe’s and how it was a coincidence because you had a brother named Joe! (etc…)”.\n" +
            "•\tDon’t go on about experience you may have that isn’t related to the job you’re interviewing for.\n",

            "DO:\n" +
                    "\n" +
                    "•\tGrab hold of the opportunity this question gives you. This question really lets you guide the interview where you want it to go. This your chance to relate your most impressive success story, so take advantage!\n" +
                    "•\tHighlight a strength that is crucial to the position. \n" +
                    "•\tFind out from your company research and from the job description what strengths the company puts a lot of stock into.\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tDon’t make claims that you can’t illustrate with a brief example or fact.\n" +
                    "•\tDon’t be overly modest but don’t claim to be Superman or Superwoman either.\n" +
                    "•\tDon’t name a strength that is irrelevant to the job at hand.\n",

            "DO:\n" +
                    "\n" +
                    "•\tShow that you are aware of your weakness and what you have done to overcome it.\n" +
                    "•\tShow that you are “self-aware” and that you have the ability to take steps to improve yourself.\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tDon’t you DARE answer with the cliche “I’m a perfectionist” answer or any other such answer that the hiring manager can see right through.\n" +
                    "•\tDon’t highlight a weakness that is a core competency of the job. (Know the job description “inside and out”.)\n" +
                    "•\tDon’t dodge this question.\n",

            "DO:\n" +
                    "\n" +
                    "•\tTalk about specific things you like about the company. Do your homework before and find out the needs of the company and talk about how you’re passionate about “fulfilling those needs”.\n" +
                    "•\tBe complimentary. Most people enjoy being flattered. (Just don’t go overboard)\n" +
                    "•\tShow how your strengths perfectly align with the job position and company culture.\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tDon’t come off as a “hired gun” who may be gone in a few months.\n" +
                    "•\tDon’t say “because I need the money.” (You’d be surprised how many job seekers think this is “cute” and actually answer this way. Don’t.)\n",

            "DO:\n" +
                    "\n" +
                    "•\tIf it was because you left voluntarily then reference a specific characteristic that the company you are interviewing for has that you are attracted to. One that your previous employer didn’t have.\n" +
                    "•\tIf you were let go, be honest and explain the situation and own it. Explain what you learned from the experience, because the interviewer knows you’re human, you make mistakes, and just wants to see that you were able to do something about it\n" +
                    "•\tWords like “downsizing” and “budget cuts” and “bad economy” are good defenses if they are true and are the reasons for departure from the job.\n" +
                    "\nDON’T:\n" +
                    "•\tDon’t bash your last company or boss or anything along those lines.\n" +
                    "•\tDon’t say, “It’s time for a career switch and I’d like to try my hand at the job you are offering” or “I’m tired of doing the same old thing.” Give a pointed, Positive reason for why you want to head off in a new direction.\n" +
                    "•\tDon’t lie if you were fired.\n",

            "DO:\n" +
                    "\n" +
                    "•\tTalk about an accomplishment that exhibits how you will be a perfect fit for the company and for the position you’re interviewing for.\n" +
                    "•\tTry and show some genuine passion when you’re talking about your accomplishment.\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tDon’t fall into the trap of thinking your accomplishment is “too small”. The fact is, relating a small accomplishment that is inline with “what the company values” can be more powerful than an unrelated accomplishment. \n",

            "DO:\n" +
                    "\n" +
                    "•\tPick an example that shows you tackling a problem that could arise at the new company you’re interviewing for. This shows your value.\n" +
                    "•\tBe specific and fairly concise.\n" +
                    "•\tUse the S.T.A.R. Method (Situation, Task, Action, Result – Read )\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tDon’t bash anyone in your success story. (Coworker, boss or customer!)\n" +
                    "•\tDon’t ramble.\n",
            "DO:\n" +
                    "\n" +
                    "•\tDemonstrate when you answer the question your level of commitment to the position they are interviewing you for.\n" +
                    "•\tAfter you have demonstrated your commitment to the role you are interviewing for, outline a realistic growth strategy that is directly tied to the role you’re in and the needs and values of the company.\n" +
                    "•\tStress your interest in a long-term career at the company\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tDon’t exhibit ambition to the point of seeming like this particular job is just a “brief stepping stone” for you. You need to show commitment.\n" +
                    "•\tDon’t say you want to be CEO of the company in 5 years.\n" +
                    "•\tDon’t say “Actually I want to be in YOUR seat within the next 5 years.” to the hiring manager.\n",

            "DO:\n" +
                    "\n" +
                    "•\tFocus your questions on the company and what you can do for them.\n" +
                    "•\tAsk about something you’ve discovered in your company research. This will show your passion and knowledge of the company.\n" +
                    "•\tAsk if there is any reason the hiring manager wouldn’t hire you. (This can be a little daunting to ask BUT can really pay off. It allows you to address something they may be thinking in their head but haven’t brought up.)\n" +
                    "\nDON’T:\n" +
                    "\n" +
                    "•\tNever say “No, I think I’m good.” Always have questions ready!\n" +
                    "•\tDon’t focus your questions on yourself and what you can get from them. (i.e.\n" +
                    "•\tDon’t ask questions that you could easily find the answer to.\n" +
                    "•\tDon’t ask about time off and benefits too early in the process.\n" +
                    "•\tDon’t ask how soon you can start applying for other positions in the company.\n",

            "DO:\n" +
                    "•\tShow the hiring manager that you are uniquely suited to filling this position. Be the candidate that solves their “problems“.\n" +
                    "•\tShow you know some significant details about the company and their general practices because you have researched the firm and are prepared.\n" +
                    "•\tTell a “success story” that highlights how you have the ‘qualities’ needed to fill their specific needs.\n" +
                    "\nDON’T:\n" +
                    "•\tDon’t get discouraged if the hiring manager mentions that “they have lots of very well qualified candidates…” before they lead into this question. (It’s a common “lead in”)\n" +
                    "•\tDon’t be too modest. This is your chance to shine. Make it count.\n" +
                    "•\tOn the flip side don’t go too overboard and sound too arrogant.\n" +
                    "•\tDon’t be “wishy-washy” or too general with your answer.\n" +
                    "•\tDon’t answer with “why” you want the job. Answer with “why you are the perfect fit” for the job.\n"


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        tv1=(TextView) findViewById(R.id.textview_question);
        tv2=(TextView) findViewById(R.id.textview_answer);
        btn=(Button) findViewById(R.id.button1);
        scrollView=(ScrollView) findViewById(R.id.scrollView1);
        tv1.setText(question[i]);
        tv2.setText(answer[i]);
        Bundle data = getIntent().getExtras();
        n=data.getString("Name");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                  @Override
                  public void onGlobalLayout() {
                      scrollView.smoothScrollTo(0,0);
                  }
              });

                i++;
                if(i<10){
                    tv1.setText(question[i]);
                    tv2.setText(answer[i]);
                }else {
                    if (i == 10) {
                        tv1.setText("CONCLUSION");
                        tv1.setTextSize(25);
                        tv2.setText("The key thing to remember is to focus on the needs of the company instead of your own when answering any job interview question. As we always say every job interview and every one of your answers to any job interview question should be “tailored” to the company you’re interviewing with.");
                        tv2.setTextSize(20);
                        btn.setText("HOME");
                    } else {
                        Intent intent = new Intent(Study.this,HomeScreen.class);
                        intent.putExtra("Name", n);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Study.this,HomeScreen.class);
        intent.putExtra("Name", n);
        startActivity(intent);
        finish();
    }
}
