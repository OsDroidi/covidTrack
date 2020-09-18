package com.developer.arsltech.covid_19tracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FaqsActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        recyclerView = findViewById(R.id.recyclerView);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        MovieAdapter movieAdapter = new MovieAdapter(movieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(movieAdapter);
    }

    private void initData() {
        movieList = new ArrayList<>();
        movieList.add(new Movie("What is a novel coronavirus?", "", "", "A novel coronavirus is a new coronavirus that has not been previously identified. The virus causing coronavirus disease 2019 (COVID-19), is not the same as the coronaviruses that commonly circulate among humans and cause mild illness, like the common cold.\n" +
                "\n" +
                "A diagnosis with coronavirus 229E, NL63, OC43, or HKU1 is not the same as a COVID-19 diagnosis. Patients with COVID-19 will be evaluated and cared for differently than patients with common coronavirus diagnosis."));
        movieList.add(new Movie("What is the source of the virus?", "", "", "COVID-19 is caused by a coronavirus called SARS-CoV-2. Coronaviruses are a large family of viruses that are common in people and many different species of animals, including camels, cattle, cats, and bats.  Rarely, animal coronaviruses can infect people and then spread between people. This occurred with MERS-CoV and SARS-CoV, and now with the virus that causes COVID-19. The SARS-CoV-2 virus is a betacoronavirus, like MERS-CoV and SARS-CoV. All three of these viruses have their origins in bats. The sequences from U.S. patients are similar to the one that China initially posted, suggesting a likely single, recent emergence of this virus from an animal reservoir. However, the exact source of this virus is unknown."));
        movieList.add(new Movie("How does the virus spread?", "", "", "The virus that causes COVID-19 is thought to spread mainly from person to person, mainly through respiratory droplets produced when an infected person coughs or sneezes. These droplets can land in the mouths or noses of people who are nearby or possibly be inhaled into the lungs. Spread is more likely when people are in close contact with one another (within about 6 feet).\n" +
                "\n" +
                "COVID-19 seems to be spreading easily and sustainably in the community (“community spread”) in many affected geographic areas. Community spread means people have been infected with the virus in an area, including some who are not sure how or where they became infected."));
        movieList.add(new Movie("Why are we seeing a rise in cases?", "", "", "The number of cases of COVID-19 being reported in the United States is rising due to increased laboratory testing and reporting across the country. The growing number of cases in part reflects the rapid spread of COVID-19 as many U.S. states and territories experience community spread. More detailed and accurate data will allow us to better understand and track the size and scope of the outbreak and strengthen prevention and response efforts."));
        movieList.add(new Movie("Can someone who has had COVID-19 spread the illness to others?", "", "", "The virus that causes COVID-19 is spreading from person-to-person. People are thought to be most contagious when they are symptomatic (the sickest). That is why CDC recommends that these patients be isolated either in the hospital or at home (depending on how sick they are) until they are better and no longer pose a risk of infecting others. More recently the virus has also been detected in asymptomatic persons.\n" +
                "\n" +
                "How long someone is actively sick can vary so the decision on when to release someone from isolation is made using a test-based or non-test-based strategy (i.e. time since illness started and time since recovery) in consultation with state and local public health officials. The decision involves considering the specifics of each situation, including disease severity, illness signs and symptoms, and the results of laboratory testing for that patient."));
        movieList.add(new Movie("Am I at risk for COVID-19 from mail, packages, or products?", "", "", "There is still a lot that is unknown about COVID-19 and how it spreads. Coronaviruses are thought to be spread most often by respiratory droplets. Although the virus can survive for a short period on some surfaces, it is unlikely to be spread from domestic or international mail, products or packaging. However, it may be possible that people can get COVID-19 by touching a surface or object that has the virus on it and then touching their own mouth, nose, or possibly their eyes, but this is not thought to be the main way the virus spreads."));
        movieList.add(new Movie("What is the risk of my child becoming sick with COVID-19?", "", "", "Based on available evidence, children do not appear to be at higher risk for COVID-19 than adults. While some children and infants have been sick with COVID-19, adults make up most of the known cases to date. "));
        movieList.add(new Movie("How can I protect my child from COVID-19 infection?", "", "", "You can encourage your child to help stop the spread of COVID-19 by teaching them to do the same things everyone should do to stay healthy.\n" +
                "\n" +
                "- Avoid close contact with people who are sick.\n" +
                "- Stay home when you are sick, except to get medical care.\n" +
                "- Cover your coughs and sneezes with a tissue and throw the tissue in the trash.\n" +
                "- Wash your hands often with soap and water for at least 20 seconds, especially after blowing your nose, coughing, or sneezing; going to the bathroom; and before eating or preparing food.\n" +
                "- If soap and water are not readily available, use an alcohol-based hand sanitizer with at least 60% alcohol. Always wash hands with soap and water if hands are visibly dirty.\n" +
                "- Clean and disinfect frequently touched surfaces and objects (e.g., tables, countertops, light switches, doorknobs, and cabinet handles).\n" +
                "- Launder items, including washable plush toys, as appropriate and in accordance with the manufacturer’s instructions. If possible, launder items using the warmest appropriate water setting for the items and dry items completely. Dirty laundry from an ill person can be washed with other people’s items."));
        movieList.add(new Movie("Are the symptoms of COVID-19 different in children than in adults?", "", "", "No. The symptoms of COVID-19 are similar in children and adults. However, children with confirmed COVID-19 have generally presented with mild symptoms. Reported symptoms in children include cold-like symptoms, such as fever, runny nose, and cough. Vomiting and diarrhea have also been reported. It’s not known yet whether some children may be at higher risk for severe illness, for example, children with underlying medical conditions and special healthcare needs. There is much more to be learned about how the disease impacts children."));
        movieList.add(new Movie("What are the symptoms and complications that COVID-19 can cause?", "", "", "People with COVID-19 have had a wide range of symptoms reported – ranging from mild symptoms to severe illness. Symptoms may appear 2-14 days after exposure to the virus. People with these symptoms may have COVID-19:\n" +
                "\n" +
                "- Cough\n" +
                "- Shortness of breath or difficulty breathing\n" +
                "- Fever\n" +
                "- Chills\n" +
                "- Muscle pain\n" +
                "- Sore throat\n" +
                "- New loss of taste or smell\n" +
                "Children have similar symptoms to adults and generally have mild illness.\n" +
                "\n" +
                "This list is not all inclusive. Other less common symptoms have been reported, including gastrointestinal symptoms like nausea, vomiting, or diarrhea."));
        movieList.add(new Movie("Is it possible to have the flu and COVID-19 at the same time?", "", "", "Yes. It is possible to test positive for flu (as well as other respiratory infections) and COVID-19 at the same time."));
        movieList.add(new Movie("What are the symptoms of COVID-19?", "", "", "Symptoms can include fever, cough and shortness of breath. In more severe cases, infection can cause\n" +
                "pneumonia or breathing difficulties. More rarely, the disease can be fatal. These symptoms are similar to\n" +
                "the flu (influenza) or the common cold, which are a lot more common than COVID-19. This is why testing\n" +
                "is required to confirm if someone has COVID-19"));
        movieList.add(new Movie("Should I be tested for COVID-19?", "", "", "Maybe; not everyone needs to be tested for COVID-19.\n" +
                "\n" +
                "If you have symptoms of COVID-19 and want to get tested, call your healthcare provider first."));
        movieList.add(new Movie("If I have recovered from COVID-19, will I be immune to it?", "", "", "We do not know yet if people who recover from COVID-19 can get infected again. CDC and partners are investigating to determine if a person can get sick with COVID-19 more than once. Until we know more, continue to take steps to protect yourself and others."));
        movieList.add(new Movie("What is the difference between cleaning and disinfecting?", "", "", "Cleaning with soap and water removes germs, dirt, and impurities from surfaces. It lowers the risk of spreading infection. Disinfecting kills germs on surfaces. By killing germs on a surface after cleaning, it can further lower the risk of spreading infection."));
        movieList.add(new Movie("Can I get COVID-19 from my pets or other animals?", "", "", "At this time, there is no evidence that animals play a significant role in spreading the virus that causes COVID-19. Based on the limited information available to date, the risk of animals spreading COVID-19 to people is considered to be low.  A small number of pets have been reported to be infected with the virus that causes COVID-19, mostly after contact with people with COVID-19.\n" +
                "\n" +
                "Pets have other types of coronaviruses that can make them sick, like canine and feline coronaviruses. These other coronaviruses cannot infect people and are not related to the current COVID-19 outbreak.\n" +
                "\n" +
                "However, since animals can spread other diseases to people, it’s always a good idea to practice healthy habits around pets and other animals, such as washing your hands and maintaining good hygiene. For more information on the many benefits of pet ownership, as well as staying safe and healthy around animals including pets, livestock, and wildlife, visit CDC’s Healthy Pets, Healthy People website."));
        movieList.add(new Movie("Can the virus that causes COVID-19 spread through drinking water?", "", "", "The virus that causes COVID-19 has not been detected in drinking water. Conventional water treatment methods that use filtration and disinfection, such as those in most municipal drinking water systems, should remove or inactivate the virus that causes COVID-19."));
    }


}
