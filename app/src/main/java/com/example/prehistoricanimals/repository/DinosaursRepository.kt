package com.example.prehistoricanimals.repository

import com.example.prehistoricanimals.R
import com.example.prehistoricanimals.models.Dino

object DinosaursRepository {
    val listOfDinosaurs = listOf(
        Dino(
            "Allosaurus",
            R.drawable.dino_1_allosaurus,
            "Allosaurus was certainly not the only apex predator in the Jurassic, " +
                    "as it would have to compete against other predators, such as Saurophaganax " +
                    "and not the bigger but the main rivals Ceratosaurus and Torvosaurus. However," +
                    " its weak bite force is misleading. Its skull would have been used almost like " +
                    "a hatchet to smack down on prey, causing heavy bleeding. " +
                    "It couldn't take down sauropods, but it was the perfect predator for smaller prey items."
        ),
        Dino(
            "Anchiornis Huxleyi", R.drawable.dino_2_anchiornis_huxleyi,
            "Anchiornis huxleyi was a small, paravian dinosaur with a triangular skull " +
                    "bearing several details in common with dromaeosaurids and troodontids. " +
                    "Anchiornis had very long legs, usually an indication that they were strong runners." +
                    "However, the extensive leg feathers indicate that this may be a vestigial trait," +
                    " as running animals tend to have reduced, not increased, hair or feathers on their legs." +
                    " The forelimbs of Anchiornis were also very long, similar to archaeopterygids."
        ),
        Dino(
            "Ankylosaurus",
            R.drawable.dino_3_ankylosaurus,
           "Compared with modern land animals the adult Ankylosaurus was very large." +
                   " Some scientists have estimated a length of 11 meters (36 feet)." +
                   " Another reconstruction suggests a much smaller size, at 6.25 meters (20.5 feet) long," +
                   " up to 1.5 meters (5 feet) wide and about 1.7 meters (5.5 feet) high at the hip." +
                   " Ankylosaurus may have weighed over 6,000 kilograms (13,000 lbs)," +
                   " making it one of the heaviest armored dinosaurs yet discovered. " +
                   "The body shape was low-slung and quite wide. It was quadrupedal, with the hind limbs longer than the forelimbs."
        ),
        Dino("Apatosaurus",R.drawable.dino_4_apatosaurus,
            "Apatosaurus was a large, long-necked quadrupedal animal with a long," +
                    " whip-like tail, possibly for sef-defense against predators, forelimbs were slightly shorter than its hindlimbs." +
                    " One measurement places the total length of the species Apatosaurus louisae at 21.8 m (72 ft)."
        ),
        Dino("Archaeopteryx",R.drawable.dino_5_archaeopteryx,
        "Archaeopteryx (Greek for ancient wing, old wing, or ancient feather) was the " +
                "first bird to evolve and unlike most birds today, still had teeth." +
                " It lived in the late Jurassic period in Germany, about 150-148 million years ago.At first sight," +
                " the 150-million-year-old fossil of an Archaeopteryx looks very like a living bird, with broad," +
                " feathered wings. But it had a long, bony tail like an extinct Dinosaur. " +
                "This combination of feathers does not exist in any modern animal."),
        Dino("Brachiosaurus",R.drawable.dino_6_brachiosaurus,
        "Brachiosaurus altithorax (meaning \"arm lizard\") is a large genus of small skull" +
                " (about the size of a common horse skull), long muscular tail, and thin columnar limbs." +
                " As with other Brachiosauridae, it was over 40 feet tall. It was a herbivore."),
        Dino("Dilophosaurus",R.drawable.dino_7_dilophosaurus,
            "Dilophosaurus wetherilli (Greek, \"double crested lizard\") was the first " +
                    "large carnivorous dinosaur to appear in North America during the early Jurassic period." +
                    " It is distinctly known from its famous two crests rounding above its skull." +
                    " Its fossils were uncovered in Southwestern US and possibly China."),
        Dino("Dracorex",R.drawable.dino_8_dracorex,
            "Dracorex (meaning Dragon King) is a genus of pachycephalosaur, from the " +
                    "late-Cretaceous of North America, 66 million years ago. Dracorex, along with Stygimoloch," +
                " Nanotyrannus and a few others, was the last dinosaur to appear on Earth."),
        Dino("Iguanodon",R.drawable.dino_9_iguanodon,
            "Iguanodon is a genus of ornithopod dinosaur that lived from about 139-138 " +
                    "million years ago, from the early to late Cretaceous period. Iguanodon was the" +
                    " second dinosaur ever discovered and it was one of the first dinosaurs to be named," +
                    " preceded only by Megalosaurus. Iguanodon's name means \"iguana tooth\" due to its iguana-like teeth. It was the largest of its kind."),
        Dino("Microraptor",R.drawable.dino_10_microraptor,
            "It was one of the smallest known dinosaurs. An unusual and unique feature were" +
                    " the four wings it had. Not like a dragonfly, but wings on its arms and legs." +
                    " It was probably a carnivore, having been found with Enantiornithe (an extinct " +
                    "type of bird) remains, probably using the same methods as modern day eagles and hawks," +
                    " in which the \"raptors\" are believed to have evolved. It was one of the few definitely flying non-avian dinosaurs," +
                " having adaptations similar to modern birds like a propatagium and an allula,"),
        Dino("Parasaurolophus",R.drawable.dino_11_parasaurolophus,
            "Parasaurolophus is a hadrosaurid, part of a diverse family of Cretaceous" +
                    " dinosaurs known for their range of bizarre head adornments. " +
                    "This genus is known for its large, elaborate cranial crest, which at its" +
                    " largest forms a long curved tube projecting upwards and back from the skull."),
        Dino("Spinosaurus",R.drawable.dino_12_spinosaurus,
            "Spinosaurus aegyptiacus (meaning \"spined lizard\") is an extinct genus of " +
                    "large spinosaurid theropod dinosaur that inhabited early to middle Cretaceous " +
                    "(Cenomanian) in Northern Africa, states such as Morocco, Egypt, Tunusia, Libya;" +
                    " approximately 99 to 93.5 million years ago." +
                    " The first known remains were found in Egypt by the German paleontologist Ernst Stromer in 1912."),
        Dino("Stegosaurus",R.drawable.dino_13_stegosaurus,
            "Averaging around 9 metres (30 ft) long and 4 metres (13 ft) tall, the quadrupedal " +
                    "Stegosaurus is one of the most easily identifiable dinosaurs, due to the distinctive" +
                    " double row of kite-shaped plates rising vertically along its arched back and the" +
                    " two pairs of long spikes extending horizontally near the end of its tail." +
                    " Although a large animal, it was dwarfed by its contemporaries the giant sauropods."),
        Dino("Triceratops",R.drawable.dino_14_triceratops,
            "ndividual Triceratops are estimated to have reached about 7.9 to 9.0 meters " +
                    "(25.9–29.5 feet) in length, 2.9 to 3.0 meters (9.5–9.8 feet) in height," +
                    " and 6.1–12.0 tonnes (13,000-26,000 lbs) in weight. The most distinctive" +
                    " feature is their large skull, among the largest of all land animals." +
                    " It could grow to be over 2 meters (7 feet) in length," +
                    " and could reach almost a third of the length of the entire animal."),
        Dino("Tyrannosaurus Rex",R.drawable.dino_15_tyrannosaurus_rex,
            "Tyrannosaurus (Greek for \"tyrant Lizard King\"), more commonly referred to as " +
                    "Tyrannosaurus rex or colloquially known as T. rex (or T-rex), was a genus of" +
                    " large tyrannosaurian theropod dinosaur that thrived during the " +
                    "Maastrichtian age of the late Cretaceous epoch, 68 to 66 million years ago."),
        Dino("Troodon",R.drawable.dino_16_troodon,
            "Troodon was about 2 metres (7 feet) tall and 40 kilograms (90 lb)." +
                    " It is expected to have been able to run at faster speeds with its light " +
                    "bodyweight and powerful back legs. It had a long claw on the second toe and long clawed fingers."),
        Dino("Woolly Mammoth",R.drawable.dino_17_woolly_mammoth,
            "A mammoth is any species of the extinct genus Mammuthus, proboscideans " +
                    "commonly equipped with long, curved tusks and, in northern species, a covering" +
                    " of long hair. They lived from the Pliocene epoch (from around 5 million years ago) into the " +
                    "Holocene at about 4,500 years ago in Africa, Europe, Asia, and North America."),
        Dino("Smilodon",R.drawable.dino_18_smilodon,
            "Smilodon was the heaviest-built of all machairodontine cats. Smilodon" +
                    " populator in particular was the heaviest, at 800 lbs or more. " +
                    "Its only rivals in size amongst the machairodonts were Amphimachairodus and Machairodus horribilis."),
        Dino("Douvilleiceras",R.drawable.dino_19_douvilleiceras,
            "Douvilleiceras is a genus of ammonites from the Middle to Late Cretaceous. " +
                    "Its fossils have been found worldwide, in Africa, Asia, Europe, and North and South America." +
                    "Shells of Douvilleiceras inaequinodum can reach a diameter of about 8–10 cm (3.1–3.9 in)."),
        Dino("Ophthalmosaurus",R.drawable.dino_20_ophthalmosaurus,
            "Ophthalmosaurus (\"eye lizard\") is a genus of ichthyosaur from the Middle " +
                    "to Late Jurassic of Europe, North America, and South America. It had a graceful," +
                    " 16-20-foot (5-6-meter) long dolphin-like body, but had a tail like a shark's." +
                    " It had an almost toothless snout which it used to snap up fish and squid."),
    )
}